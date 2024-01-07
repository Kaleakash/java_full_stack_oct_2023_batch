package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service			// service layer specific annotation 
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee employee) {
		if(employeeDao.storeEmployee(employee)>0) {
			return "Employee record stored";
		}else {
			return "Employee record didn't store";
		}
	}
	
	public List<Employee> getAllEmployee() {
		return employeeDao.findEmployee();
	}
}
