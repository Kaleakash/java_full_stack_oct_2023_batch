package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service 				// Service layer specific annotation 
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee employee) {
		if(employeeDao.storeEmployee(employee)>0) {
			return "Employee record stored successfully";
		}else {
			return "Employee record didnt' store";
		}
	}
	
	public String deleteEmployee(int id) {
		if(employeeDao.deleteEmployee(id)>0) {
			return "Employee record deleted successfully";
		}else {
			return "Employee record not present";
		}
	}
	
	public String updateEmployee(Employee employee) {
		if(employeeDao.updateEmployee(employee)>0) {
			return "Employee record updated successfully";
		}else {
			return "Employee record not present";
		}
	}
}
