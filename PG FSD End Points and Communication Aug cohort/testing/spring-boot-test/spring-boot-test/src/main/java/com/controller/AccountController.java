package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Account;
import com.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Account> findAllAccount() {
		return accountService.findAllAccount();
	}
	
	@GetMapping(value = "findAccountDetails/{accno}")
	public Account findAccountDetails(@PathVariable("accno") int accno) {
		return accountService.findAccount(accno);
	}
	
	@PostMapping(value = "createAccount",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
}
