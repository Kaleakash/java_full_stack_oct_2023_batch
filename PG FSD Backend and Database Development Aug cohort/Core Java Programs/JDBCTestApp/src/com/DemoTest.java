package com;
import java.sql.*;

/*
 * 
 * 
 *
 *ALTER USER 'root'@'localhost'
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
	Statement stmt = con.createStatement();
	System.out.println("Statement created");
//		// insert query 
//		int result = stmt.executeUpdate("insert into product values(3,'Laptop',89000)");
//		if(result>0) {
//			System.out.println("Record inserted successfully");
//		}
		
//		// delete query 
//			int result = stmt.executeUpdate("delete from product where pid =3");
//			if(result>0) {
//				System.out.println("Record deleted successfully");
//			}else {
//				System.out.println("Record not present");
//			}
	
			// 	update query 
//				int result = stmt.executeUpdate("update product set price = 79000 where pid=6");
//				if(result>0) {
//					System.out.println("Record updated successfully");
//				}else {
//					System.out.println("Record not present");
//				}
	// Retrieve query 
		ResultSet rs = stmt.executeQuery("select * from product");
		while(rs.next()) {
		//System.out.println("PID "+rs.getInt(1)+"PName "+rs.getString(2)+"Price is "+rs.getFloat(3));
			System.out.println("PID "+rs.getInt("pid")+"PName "+rs.getString("pname")+"Price is "+rs.getFloat("price"));
		}	
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
