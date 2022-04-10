package com.example.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CustomerMs2Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMs2Application.class, args);
	}

}
