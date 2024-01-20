package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee employee) {
		if(employeeDao.storeEmployee(employee)>0) {
			return "Employee record stored successfully";
		}else {
			return "Employee record didn't store";
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
	
	public String findEmployee(int id) {
		Employee emp = employeeDao.findEmployee(id);
		if(emp==null) {
			return "Employee record not present";
		}else {
			return emp.toString();		// display employee in string format. 
		}
	}
	
	public List<Employee> findAllEmloyee() {
		return employeeDao.findAllEmployee();
	}
	
	public List<Employee> findAllEmloyeeBySalary(float salary) {
		return employeeDao.findAllEmployeeBySalary(salary);
	}
	
}
