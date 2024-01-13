package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	
	public List<Map<String, Object>> retrieveEmployee() {
		try {
			return jdbcTemplate.queryForList("select * from employee");
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public List<Map<String, Object>> retrieveEmployeeBySalary(float salary) {
		try {
			return jdbcTemplate.queryForList("select * from employee where salary > ?", salary);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public List<Employee> findAllEmployeeAsList(){
		try {
	// 1st parameter query and 2nd parameter row mapper interface reference. 
	return jdbcTemplate.query("select * from employee", new MyRowMapper());		
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public List<Employee> findAllEmployeeAsListAsSalary(float salary){
		try {
	// 1st parameter query and 2nd parameter row mapper interface reference. 
	return jdbcTemplate.query("select * from employee where salary > ?", new MyRowMapper(),salary);		
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}

// this class like while loop but it is global while loop 

class MyRowMapper implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		return emp;
	}
}


