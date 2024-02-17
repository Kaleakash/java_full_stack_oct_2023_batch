package com.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bean.Employee;

class EmployeeServiceTest {

	@Test
	@Disabled
	void testGetEmployeeInfo() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp =  es.getEmployeeInfo();
		assertNotNull(emp);
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(12000, emp.getSalary());
	}

	@Test
	@Disabled
	void testGetAllEmployee() {
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp = es.getAllEmployee();
		assertEquals(3, listOfEmp.size());
		Employee emp = listOfEmp.get(0);
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(12000, emp.getSalary());
	}

	@Test
	@Disabled
	void testUpdateSalary() {
		EmployeeService es = new EmployeeService();
		Employee emp1 = new Employee(100, "Ravi", 12000);
		assertEquals(12000, emp1.getSalary());
		float updatedSalary = es.updateSalary(emp1);
		assertEquals(13000, updatedSalary);
	}

	@Test
	@Disabled
	void testGetEmpDetails() {
		fail("Not yet implemented");
	}

	@Test
	void testCheckLoginInfo() {
		EmployeeService es = new EmployeeService();
		boolean res1 = es.checkLoginInfo("akash@gmail.com", "123");
		boolean res2 = es.checkLoginInfo("ravi@gmail.com", "123");
		assertTrue(res1);
		assertFalse(res2);
	}

}
