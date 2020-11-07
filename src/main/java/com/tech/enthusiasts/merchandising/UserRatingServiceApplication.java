package com.tech.enthusiasts.merchandising;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserRatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRatingServiceApplication.class, args);
	}

}
