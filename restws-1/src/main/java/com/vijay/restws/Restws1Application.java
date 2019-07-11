package com.vijay.restws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@ComponentScan("com.vijay.restws.impl")
public class Restws1Application {


	public static void main(String[] args) {
		SpringApplication.run(Restws1Application.class, args);
		
		System.out.println("Execution Completed");

	}

}
