package com;
import java.sql.*;

/*
 * 
 * ALTER USER 'root'@'localhost'
IDENTIFIED WITH mysql_native_password BY 'your_new_password';
FLUSH PRIVILEGES;
 */
public class DemoTest {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_db_info", "root","root@123");
System.out.println("connected successfully");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
