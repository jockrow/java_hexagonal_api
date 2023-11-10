package com.test.api_rest.layer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// TODO:Si funciona bien quitar todo esto
// @ComponentScan(basePackages = "com.test.api_rest.) // Specify the base package where your components are located
// @RestController
// @RequestMapping("/api")
// @ComponentScan("com.test.api_rest.service") // Specify the base package where your
// @ComponentScan(basePackages = "com.test.api_rest.repository") // Specify the base package where your components are located
@SpringBootApplication
// @ComponentScan("com.test.api_rest.) // Specify the base package where your
// components
public class ApiRestApplication {
	public static void main(String[] args) {
		System.out.println(32434);
		SpringApplication.run(ApiRestApplication.class, args);
	}
}
