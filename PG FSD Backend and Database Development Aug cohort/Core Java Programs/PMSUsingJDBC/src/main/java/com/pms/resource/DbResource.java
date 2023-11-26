package com.pms.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
	static Connection con;
	static {
		
		System.out.println("This block call only once when class get loaded..");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_info", "root", "root@123");	
		} catch (Exception e) {
			System.err.println("Database connection issue "+e.toString());
		}
	}
	
	public static Connection getDbConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.err.println("getting connection "+e.toString());
		}
		return null;
	}
	
	public static void close() {
		try {
			con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
