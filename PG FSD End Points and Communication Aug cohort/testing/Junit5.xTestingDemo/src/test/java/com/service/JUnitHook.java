package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitHook {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("it will execute before all test method only once");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("it will execute after all test method only once");
	}
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("it will execute again and again before every test");
	}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("it will execute again and again after every test");
	}
	@Test
	void test1() {
		System.out.println("first test method");
	}
	@Test
	void test2() {
		System.out.println("second test method");
	}
}
