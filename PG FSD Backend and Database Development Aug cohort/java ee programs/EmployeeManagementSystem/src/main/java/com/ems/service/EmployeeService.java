package com.ems.service;

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
}
