package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.cloud.beans.Limits;
import com.spring.cloud.config.Configuration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration config;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(config.getMinimum(), config.getMaximum());
	}
	
	@GetMapping("/test")
	public String test() {
		System.out.println(config.uri);
		return restTemplate.getForObject(config.uri, String.class);
	}
}
