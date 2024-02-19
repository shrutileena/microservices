package com.feignclient.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignclient.user.client.FeignUserClient;

@SpringBootApplication
@EnableFeignClients
@RestController
public class FeignClientProjectApplication {

	@Autowired
	FeignUserClient feignUserClient;
	
	@GetMapping("/getdata")
	public Root getData(){
		return feignUserClient.getCovidData();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FeignClientProjectApplication.class, args);
	}

}
