package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Login;

@Controller
public class LoginController {

	// http://localhost:8080/
	
	@RequestMapping(value = "/")
	public String loginPageOpen(Login ll,Model mm) {		// DI for Login 
		mm.addAttribute("ll", ll);
		return "index";				// open login page. 
	}
	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
	public String checkLoginInformation(Login login) {
		
		if(login.getEmailid().equals("akash@gmail.com") && login.getPassword().equals("123")) {
			return "success";
		}else {
			return "failure";
		} 
	}
}
