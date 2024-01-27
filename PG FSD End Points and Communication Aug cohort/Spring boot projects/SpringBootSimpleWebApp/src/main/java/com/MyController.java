package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	// http://localhost:9090/		by default index.jsp page search in webapp folder. 
	// welcome-file-list tag part of web.xml file
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openPage() {
		System.out.println("I Came Here");
		return "index";			// view resolver check the page insider webapp folder as prefix 
									// end with extension .jsp af suffix  
	}
}
