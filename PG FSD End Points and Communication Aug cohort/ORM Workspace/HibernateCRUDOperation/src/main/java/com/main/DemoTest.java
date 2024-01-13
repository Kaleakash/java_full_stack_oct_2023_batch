package com.main;

import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
	// Hibernate API 
	// This class load the hibernate.cfg.xml file 
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	System.out.println("file load successfully");
	}

}
