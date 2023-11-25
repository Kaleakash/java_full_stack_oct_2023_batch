package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
