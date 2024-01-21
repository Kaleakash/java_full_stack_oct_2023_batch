package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "hello")
	public ModelAndView sayHello() {
		
		System.out.println("I came to say Hello method");
		// coding...
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display1.jsp");
		return mav;
	}
	
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public ModelAndView sayHi() {
		
		System.out.println("I came to say Hi method");
		// coding...
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display2.jsp");
		return mav;
	}
}
