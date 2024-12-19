package com.course.mobile_app_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MobileAppEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAppEurekaApplication.class, args);
	}

}
