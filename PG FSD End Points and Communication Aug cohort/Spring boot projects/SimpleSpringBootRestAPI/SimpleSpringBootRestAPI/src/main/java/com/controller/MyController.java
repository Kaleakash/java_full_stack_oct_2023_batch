package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// http://localhost:8080/say
	
	@RequestMapping(value = "say")		// by default get and response in plain text. 
	public String sayHello() {
		return "Welcome to spring boot rest api";
	}
	
	// http://localhost:8080/plain
	@RequestMapping(value = "plain",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)		 
	public String sayPlain() {
		return "<h2>Welcome to spring boot rest api</h2>";
	}
	
	// http://localhost:8080/html
		@RequestMapping(value = "html",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)		 
		public String sayHtml() {
			return "<h2>Welcome to spring boot rest api</h2>";
		}
		
		// http://localhost:8080/xml
		@RequestMapping(value = "xml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)		 
		public String sayXml() {
			return "<abc>Welcome to spring boot rest api</abc>";
		}
}
