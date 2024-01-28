package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDataApplication.class, args);
		System.err.println("Spring boot up!");
	}

}
