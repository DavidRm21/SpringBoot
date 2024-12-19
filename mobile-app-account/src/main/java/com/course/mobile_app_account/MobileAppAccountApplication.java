package com.course.mobile_app_account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MobileAppAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAppAccountApplication.class, args);
	}

}
