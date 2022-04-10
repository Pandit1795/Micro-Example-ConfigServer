package com.example.rathod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerForAdminExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerForAdminExample1Application.class, args);
	}

}
