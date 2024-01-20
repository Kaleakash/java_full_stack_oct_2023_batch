package com.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	int id;
	String name;
	float salary;
	Scanner sc = new Scanner(System.in);
	String con ="";
	String result;
	do {
		System.out.println("1:Add Employee");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:	System.out.println("Enter the id");
		       id = sc.nextInt();
		       System.out.println("Enter the name");
		       name = sc.next();
		       System.out.println("Enter the salary");
		       salary = sc.nextFloat();
		       Employee emp1 = (Employee)ac.getBean("employee");
		       emp1.setId(id);
		       emp1.setName(name);
		       emp1.setSalary(salary);
		       result = es.storeEmployee(emp1);
		       System.out.println(result);
			break;

		default:System.out.println("Wrong choice");
			break;
		}
		System.out.println("do you want to continue?(y/n)");
		con = sc.next();
	} while (con.equalsIgnoreCase("y"));
	System.out.println("Thank you!");

	}

}
