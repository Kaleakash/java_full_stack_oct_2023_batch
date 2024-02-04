package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	// http://localhost:9090/createAccount
	// method post 
	// {"accno":3,"name":"Lex","amount":18000}	key name must be map to entity class variable name 
			@RequestMapping(value = "createAccount",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	
	public String createAccount(@RequestBody Account account) {	// @RequestBody annotation is use
		// extract json data from reqeust body part 
			System.out.println(account.getAccno()+" "+account.getAmount()+" "+account.getName());
			return accountService.accountCreate(account);
	}
	
	// http://localhost:9090/deleteAccount/1
	// http://localhost:9090/deleteAccount/100		
	// method delete 
			
	@RequestMapping(value = "deleteAccount/{accno}",method = RequestMethod.DELETE)
	public String deleteAccount(@PathVariable("accno") int accno) {
		return accountService.deleteAccount(accno);
	}		
	
	// http://localhost:9090/withdraw
	// method patch 
	// data as json {"accno":2,"amount":100}
	// data as json {"accno":10,"amount":100}
	
	@RequestMapping(value = "withdraw",method = RequestMethod.PATCH,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String withdrawn(@RequestBody Account account) {
		return accountService.withdrawn(account.getAccno(), account.getAmount());
	}
	
	// http://localhost:9090/deposite/2/100
	// http://localhost:9090/deposite/10/100
	// method put 
	@RequestMapping(value = "deposite/{accno}/{amount}",method = RequestMethod.PUT)
	public String deposite(@PathVariable("accno") int accno, @PathVariable("amount") float amount) {
		return accountService.deposit(accno,amount);
	}
}

