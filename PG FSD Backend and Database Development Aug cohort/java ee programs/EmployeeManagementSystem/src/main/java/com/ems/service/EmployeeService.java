package com.ems.service;

import java.util.List;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<20000) {
			return "Salary must be > 20000";
		}else if (ed.storeEmployee(emp)>0) {
			return "Employee record stored successfully";
		}else {
			return "Employee record didn't store";
		}
	}
	
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployee(emp)>0) {
			return "Employee Salary updated successfully";
		}else {
			return "Employee salary didn't update";
		}
	}
	
	public String deleteEmployee(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Employee record successfully";
		}else {
			return "Employee record didn't delete";
		}
	}
	
	public List<Employee> findAllEmployee() {
		return ed.findAllEmployees();
	}
	
}
