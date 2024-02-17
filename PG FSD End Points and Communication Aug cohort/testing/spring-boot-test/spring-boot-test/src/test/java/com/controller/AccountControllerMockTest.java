package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Account;
import com.service.AccountService;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class AccountControllerMockTest {

	@Mock
	AccountService accountService;
	
	@InjectMocks
	AccountController accountController;
	
	@Test
	@Disabled
	void testFindAllAccount() {
		// provide fake data for findAccountDetails from service layer 
		Account acc1 = new Account(100, "A", 1200);
		Account acc2 = new Account(101, "B", 1400);
		List<Account> listAccount = new ArrayList<>();
		listAccount.add(acc1);
		listAccount.add(acc2);
		Mockito.when(accountService.findAllAccount()).thenReturn(listAccount);
		
		
		List<Account> listOfAccountTest = accountController.findAllAccount();
		assertEquals(2, listOfAccountTest.size());
	}

	@Test
	@Disabled
	void testFindAccountDetails() {
		fail("Not yet implemented");
	}

	@Test
	void testCreateAccount() {
		// fake result 
		Account acc = new Account(1, "Akash", 1000);
		Mockito.when(accountService.createAccount(acc)).thenReturn("Account created");
		
		String result = accountController.createAccount(acc);
		assertEquals("Account created", result);
	}

}
