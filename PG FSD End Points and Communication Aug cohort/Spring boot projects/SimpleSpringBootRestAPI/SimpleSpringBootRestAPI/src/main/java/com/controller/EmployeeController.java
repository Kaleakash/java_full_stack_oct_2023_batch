package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	// http://localhost:8080/employee // jackson jar file is responsible to convert java to json format. 
	
	@RequestMapping(value = "employee",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		// we can get this info from database. 
		Employee emp = new Employee(100, "Ravi", 12000);
		return emp;
	}
	
	// http://localhost:8080/employees
	@RequestMapping(value = "employees",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees() {
		// we can get this info from database. 
		Employee emp1 = new Employee(101, "Ravi", 12000);
		Employee emp2 = new Employee(102, "Steven", 15000);
		Employee emp3 = new Employee(103, "Lex", 18000);
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		return listOfEmp;
	}
}
