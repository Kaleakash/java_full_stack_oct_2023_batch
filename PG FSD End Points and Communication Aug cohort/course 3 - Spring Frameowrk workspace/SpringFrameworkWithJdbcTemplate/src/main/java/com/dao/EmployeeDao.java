package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository				// dao layer specific annotation 
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;			// byType 
	
	public int storeEmployee(Employee employee) {
		try {
// 1st parameter query and 2nd parameter var arguments. it is use to do DML Operation 
return jdbcTemplate.update("insert into employee values(?,?,?)", employee.getId(),employee.getName(),employee.getSalary());		
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	public int deleteEmployee(int id) {
		try {
// 1st parameter query and 2nd parameter var arguments. it is use to do DML Operation 
return jdbcTemplate.update("delete from employee where id = ?", id);				
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	public int updateEmployee(Employee employee) {
		try {
// 1st parameter query and 2nd parameter var arguments. it is use to do DML Operation 
return jdbcTemplate.update("update employee set salary = ? where id = ?",employee.getSalary(),employee.getId());		
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
}





