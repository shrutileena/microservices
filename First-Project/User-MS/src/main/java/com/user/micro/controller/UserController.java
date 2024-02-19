package com.user.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Environment env;

	@Autowired
	RestTemplate rest;
	
	@GetMapping("/status/check")
	public String status() {
		return "port number " + env.getProperty("local.server.port");
	}
	
	@GetMapping("/wish")
	public String getWish() {
		String url = "http://localhost:8030/account/wish";
		String result = rest.getForObject(url, String.class);
		return result;
	}
	
}
