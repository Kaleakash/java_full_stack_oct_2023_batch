package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping(value = "/")
	public String sayHello() {
		String msg ="<body style='background-color=pink;'>"
				+ "<div style='color:red;font-size=40pt'>Dr"
				+ "Shawn runs a pet clinic. He needs to record the visits and other details</div></body>";
		return msg;
	}
}
