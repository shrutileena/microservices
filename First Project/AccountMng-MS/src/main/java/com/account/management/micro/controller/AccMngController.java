package com.account.management.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccMngController {

	@Autowired
	private Environment env;
	
	@GetMapping("/check")
	public String check() {
		return "port number " + env.getProperty("local.server.port");
	}
	
	@GetMapping("/wish")
	public String wish() {
		return "i am very happy today";
	}
	
}
