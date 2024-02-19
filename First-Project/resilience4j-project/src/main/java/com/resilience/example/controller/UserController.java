package com.resilience.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class UserController {

	private static final String USER_SERVICE = "userService";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/user/create")
	@CircuitBreaker(name = "userService", fallbackMethod = "orderFallback")
	public String createOrder() {
		String response = restTemplate.getForObject("http://localhost:8030/account/wish", String.class);
		return response;
	}

	public String orderFallback(Exception e) {
		return "Service is down. Come again.";
	}
}
