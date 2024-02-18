package com;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.entity.Login;
import com.repository.LoginRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
public class AuthMicroServiceApplication {

	@Autowired
	LoginRepository loginRepository;

	
	@PostConstruct
	public void init() {
	Optional<Login> op = loginRepository.findById("admin@gmail.com");
	if(op.isPresent()) {
		System.err.println("Admin account alredy exits");
	}else {
		Login ll = new Login();
		ll.setEmailid("admin@gmail.com");
		ll.setPassword("admin@123");
		ll.setTypeofuser("admin");
		loginRepository.save(ll);
		System.err.println("Admin account created successfully..");
	}
	
	}
	
		
	public static void main(String[] args) {
		SpringApplication.run(AuthMicroServiceApplication.class, args);
		System.err.println("auth micro service upon on port number 8181");
	}

}
