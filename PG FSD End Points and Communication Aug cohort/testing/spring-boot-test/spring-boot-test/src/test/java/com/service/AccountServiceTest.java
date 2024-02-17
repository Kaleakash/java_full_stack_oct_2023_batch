package com.service;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.entity.Account;

@ExtendWith(SpringExtension.class)
@SpringBootTest					// spring boot specific annotation for testing 
class AccountServiceTest {

	@Autowired
	AccountService accountService;
	
	@Test
	@Disabled
	void testCreateAccount() {
	Account acc1 = new Account();
	acc1.setAccno(1);
	acc1.setName("Ajay");
	acc1.setAmount(2500);
	String result = accountService.createAccount(acc1);
	assertEquals("Account Created successfully", result);
	}
	@Test
	@Disabled
	void testFindAccount() {
		Account acc1 = accountService.findAccount(3);
		assertNotNull(acc1);
		assertEquals(1790, acc1.getAmount());
		Account acc2 = accountService.findAccount(1);
		assertNull(acc2);
	}
	@Test
	void testFindAllAccount() {
		//fail("Not yet implemented");
		List<Account> listOfAccount = accountService.findAllAccount();
		assertEquals(4, listOfAccount.size());
	}

}
