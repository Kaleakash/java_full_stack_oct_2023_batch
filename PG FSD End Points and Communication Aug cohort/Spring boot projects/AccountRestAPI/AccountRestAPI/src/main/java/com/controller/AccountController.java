package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Account;
import com.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;
	
	// http://localhost:9090/findAllAccount 
	
	@RequestMapping(value = "findAllAccount",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Account> findAllAccountDetails() {
		return accountService.findAllAccount();
	}
	// http://localhost:9090/findAccountInfo/1			using path param 
	// http://localhost:9090/findAccountInfo/2
	
	@RequestMapping(value = "findAccountInfo/{accno}",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Account findAccountInfo(@PathVariable("accno") int accno) {
		return accountService.findAccountInfo(accno);
	}
	
}

