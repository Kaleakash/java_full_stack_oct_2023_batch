package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController{

	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
	public String checkLoginDetails(HttpServletRequest req) {  // DI for request object 
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(email.equals("akash@gmail.com") && password.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
}
