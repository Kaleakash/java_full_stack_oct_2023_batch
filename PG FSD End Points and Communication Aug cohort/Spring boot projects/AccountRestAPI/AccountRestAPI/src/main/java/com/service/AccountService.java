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
	
	public List<Account> findAllAccount() {
		return accountRepository.findAll();
	}
	
	public Account findAccountInfo(int accno) {
		Optional<Account> op = accountRepository.findById(accno);
		if(op.isPresent()) {
			Account acc = op.get();
			return acc;
		}else {
			return null;
		}
	}
	
	public String accountCreate(Account account) {
		Optional<Account> op = accountRepository.findById(account.getAccno());
		if(op.isPresent()) {
			return "Account already present it must be unique";  
		}else {
			accountRepository.save(account);
			return "Account Created successfully";
		}
	}
	
	public String withdrawn(int accno, float amount) {
		Optional<Account> op = accountRepository.findById(accno);
		if(op.isPresent()) {
			Account acc = op.get();
			
			if(acc.getAmount()>amount) {
			acc.setAmount(acc.getAccno()-amount);		// 1000 -200
			accountRepository.saveAndFlush(acc);
			return "Amount withdrawn successfully";
			}else {
				return "Insufficient amount you can't withdraw";
			}
			
		}else {
			return "Account didn't exits";
		}
	}
	
	public String deposit(int accno, float amount) {
		Optional<Account> op = accountRepository.findById(accno);
		if(op.isPresent()) {
			Account acc = op.get();
			
			acc.setAmount(acc.getAccno()+amount);		// 1000 + 200
			
			accountRepository.saveAndFlush(acc);
			return "Amount deposit successfully";
		}else {
			return "Account didn't exits";
		}
	}
	
	public String deleteAccount(int accno) {
		Optional<Account> op = accountRepository.findById(accno);
		if(op.isPresent()) {
			Account acc = op.get();
			accountRepository.delete(acc);
			return "Account information deleted successfully";
		}else {
			return "Account didn't exits";
		}
	}
	
}
