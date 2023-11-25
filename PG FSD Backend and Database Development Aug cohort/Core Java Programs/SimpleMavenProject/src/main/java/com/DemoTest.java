package com;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded successfully");
		} catch (Exception e) {
		System.out.println(e);
		}
	}

}
