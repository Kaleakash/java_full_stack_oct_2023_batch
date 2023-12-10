package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ems.bean.Employee;
import com.ems.resource.DbResource;

public class EmployeeDao {

	public int storeEmployee(Employee emp) {
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, emp.getId());
		pstmt.setString(2, emp.getName());
		pstmt.setFloat(3, emp.getSalary());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}
