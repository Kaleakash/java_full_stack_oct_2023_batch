package com.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pms.bean.Product;
import com.pms.resource.DbResource;

public class ProductDao {

	public int storeProduct(Product product) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_info", "root", "root@123");
		Connection con = DbResource.getDbConnection();
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
	public int updateProductPrice(Product product) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_info", "root", "root@123");
			Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid=?");
		pstmt.setInt(2, product.getPid());
		pstmt.setFloat(1, product.getPrice());
		int res = pstmt.executeUpdate();
		return res;
		} catch (Exception e) {
			System.err.println(e.toString());
			return 0;
		}
	}
	public int deleteProduct(int pid) {
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_info", "root", "root@123");
			Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("delete from product where pid =?");
		pstmt.setInt(1, pid);
		int res = pstmt.executeUpdate();
		return res;
		} catch (Exception e) {
			System.err.println(e.toString());
			return 0;
		}
	}
	
	public Product findProductById(int pid) {
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_info", "root", "root@123");
			Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from product where pid=?");
		pstmt.setInt(1, pid);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			Product p = new Product();			// converting query into object. 
			p.setPid(rs.getInt("pid"));
			p.setPname(rs.getString("pname"));
			p.setPrice(rs.getFloat("price"));
			return p;
		}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return null;
	}
	// this method convert all product table records in list of product. 
	public List<Product> findAllProducts() {
		List<Product> listOfProduct = new ArrayList<>();
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_info", "root", "root@123");
			Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from product");
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Product p = new Product();			// converting query into object. 
			p.setPid(rs.getInt("pid"));
			p.setPname(rs.getString("pname"));
			p.setPrice(rs.getFloat("price"));
			
			listOfProduct.add(p);
		}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return listOfProduct;
	}
}
