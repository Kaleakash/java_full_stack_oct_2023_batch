package com.service;

import java.util.List;
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
		Optional<Account> op  = accountRepository.findById(account.getAccno());
		if(op.isPresent()) {
			return "Account already present";
		}else {
			accountRepository.save(account);
			return "Account Created successfully";
		}
	}
	
	public Account findAccount(int accno) {
		Optional<Account> op  = accountRepository.findById(accno);
		if(op.isPresent()) {
			Account acc = op.get();
			return acc;
		}else {
			return null;
		}
	}
	
	public List<Account> findAllAccount() {
		return accountRepository.findAll();
	}
	
}
