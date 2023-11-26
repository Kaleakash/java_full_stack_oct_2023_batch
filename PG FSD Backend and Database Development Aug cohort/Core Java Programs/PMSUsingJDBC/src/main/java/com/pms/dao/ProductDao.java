package com.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.pms.bean.Product;

public class ProductDao {

	public int storeProduct(Product product) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_info", "root", "root@123");
		PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
		pstmt.setInt(1, product.getPid());
		pstmt.setString(2, product.getPname());
		pstmt.setFloat(3, product.getPrice());
		int res = pstmt.executeUpdate();
		return res;
		} catch (Exception e) {
			System.err.println(e.toString());
			return 0;
		}
	}
}
