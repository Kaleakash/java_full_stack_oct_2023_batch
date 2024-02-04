package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")
public class SimpleController {
	
	// http://localhost:8282/second/say
	
	@GetMapping(value = "say")
	public String sayHello() {
		return "Welcome spring boot second micro service";
	}
}
