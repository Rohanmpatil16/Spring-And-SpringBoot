package com.rohan.SpringBootWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {
	    "com.rohan.SpringBootWeb",
	    "com.rohan.SpringBootWeb.controller1",
	    "com.rohan.SpringBootWeb.service1",
	    "com.rohan.SpringBootWeb.model1"
	})
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}
