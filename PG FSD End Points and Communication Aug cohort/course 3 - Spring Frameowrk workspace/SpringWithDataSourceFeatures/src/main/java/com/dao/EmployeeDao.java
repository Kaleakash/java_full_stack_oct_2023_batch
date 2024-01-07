package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Employee;

public class EmployeeDao {

	@Autowired			// it will do by default byType. 
	DataSource ds;	// In EJB program using JNDI look we were searching database details in application server. 
					// JNDI : Java Naming Directive Inteface. which help to search resource or connection details. 
					// but in spring using autowired we can achieve data source features. 

	public int storeEmployee(Employee employee) {
		try {
		Connection con = ds.getConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, employee.getId());
		pstmt.setString(2, employee.getName());
		pstmt.setFloat(3, employee.getSalary());
		return pstmt.executeUpdate();
		} catch (Exception e) {
				System.err.println(e);
				return 0;
		}
	}
	
	
	public List<Employee> findEmployee() {
		List<Employee> listOfEmp = new ArrayList<>();
		try {
		Connection con = ds.getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from employee");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getFloat(3));
			listOfEmp.add(emp);
		}
		} catch (Exception e) {
				System.err.println(e);
		}
		return listOfEmp;
	}
}
