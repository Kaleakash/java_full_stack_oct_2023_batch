package com.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
	
	public List<Map<String, Object>> findAllEmployeeAsMap() {
		return employeeDao.retrieveEmployee();
	}
	
	public List<Map<String, Object>> findAllEmployeeAsMapBySalary(float salary) {
		return employeeDao.retrieveEmployeeBySalary(salary);
	}
	
	
	public List<Employee> findAllEmployeeAsList(){
		List<Employee> listOfEmp = employeeDao.findAllEmployeeAsList();
		Iterator<Employee> li  = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			emp.setSalary(emp.getSalary()+1000);
		}
		return listOfEmp;
	} 
	public List<Employee> findAllEmployeeAsListBySalary(float salary){
		return employeeDao.findAllEmployeeAsListAsSalary(salary);
	}
	
	
}
