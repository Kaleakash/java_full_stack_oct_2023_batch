package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")
public class SimpleController {

	// http://localhost:8181/first/say 
	
	@GetMapping(value = "/say")
	public String sayHello() {
		return "Welcome to First Micro Service Project";
	}
}
