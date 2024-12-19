package com.course.mobile_app_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class MobileAppGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAppGatewayApplication.class, args);
	}

}
