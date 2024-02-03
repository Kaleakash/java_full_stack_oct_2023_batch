package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")// Enable @restcontroller, @service, @repository 
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
public class AccountRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountRestApiApplication.class, args);
		System.err.println("spring boot up on port number 9090");
	}

}
