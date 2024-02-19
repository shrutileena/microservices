package com.account.management.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountMngMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMngMsApplication.class, args);
	}

}
