package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		Optional<Account> op = accountRepository.findById(account.getAccno());
		if(op.isPresent()) {
			return "Account number must be unique";
		}else {
			accountRepository.save(account);
			return "Account created";
		}
	}
	
	public String findBalanceByAccno(int accno) {
		Optional<Account> op = accountRepository.findById(accno);
		if(op.isPresent()) {
			Account acc  = op.get();
			return "Your balance is "+acc.getAmount();
		}else {
				return "Account not present";
		}
	}
	
	public String findBalanceByEmailId(String emailid) {
		try {
			return "Your Balance is "+accountRepository.findAccountByEmaild(emailid);
		} catch (Exception e) {
			System.err.println(e);
			return "Account not present";
		}
	}
}
