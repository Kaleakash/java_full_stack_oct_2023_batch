package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {

	public Employee getEmployeeInfo() {
		// We can get employee object from dao layer from database 
		Employee emp1 = new Employee(100, "Ravi", 12000);
		return emp1;
	}
	public List<Employee> getAllEmployee() {
		// all object from db 
		Employee emp1 = new Employee(100, "Ravi", 12000);
		Employee emp2 = new Employee(101, "Raju", 14000);
		Employee emp3 = new Employee(102, "Steven", 18000);
		List<Employee> listOfEmp  = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		return listOfEmp;
	}
	public float updateSalary(Employee emp) {
		// with condition we can update the salary;
		return emp.getSalary()+1000;
	}
	public Employee getEmpDetails(int id, String name, float salary) {
		// condition 
		Employee emp = new Employee(id, name, salary);
		return emp;
	}
	public boolean checkLoginInfo(String emailid, String password) {
		// check from db
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
}
