package com.controller;

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
@SpringBootTest
class AccountControllerTest {

	@Autowired
	AccountController accountController;
	
	@Test
	void testFindAllAccount() {
		List<Account> listOfAccount= accountController.findAllAccount();
		assertEquals(4, listOfAccount.size());
	}

	@Test
	@Disabled
	void testFindAccountDetails() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testCreateAccount() {
		fail("Not yet implemented");
	}

}
