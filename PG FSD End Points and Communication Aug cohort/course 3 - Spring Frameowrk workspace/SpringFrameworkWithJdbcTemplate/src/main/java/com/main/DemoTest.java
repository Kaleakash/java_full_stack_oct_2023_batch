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
	Scanner sc = new Scanner(System.in);
	String con="";
	int choice;
	int id;
	String name;
	float salary;
	String result;
	do {
		System.out.println("1:Add Employee 2 : Delete Employee 3: Update Employee");
		System.out.println("Enter your choice");
		
		choice  = sc.nextInt();
		switch (choice) {
		case 1:Employee emp1 = (Employee)ac.getBean("employee");
			 System.out.println("Enter the id");
			 id  = sc.nextInt();
			 System.out.println("Enter the name");
			 name = sc.next();
			 System.out.println("Enter the salary");
			 salary = sc.nextFloat();
			 emp1.setId(id);
			 emp1.setName(name);
			 emp1.setSalary(salary);
			 result = es.storeEmployee(emp1);
			 System.out.println(result);
			break;
		case 2 : System.out.println("Enter the id");
		 		id  = sc.nextInt();
		 		result = es.deleteEmployee(id);
		 		System.out.println(result);
		 	break;
		case 3 : Employee emp2 = (Employee)ac.getBean("employee");
		 		System.out.println("Enter the id");
		 		id  = sc.nextInt();
		 		System.out.println("Enter the salary");
		 		salary = sc.nextFloat();
		 		emp2.setId(id);
		 		emp2.setSalary(salary);
		 		result = es.updateEmployee(emp2);
		 		System.out.println(result);
		 		break;
		 
		default:System.out.println("Wrong choice");
			break;
		}
		System.out.println("Do you want to continue(y/n)");
		con = sc.next();
	} while (con.equalsIgnoreCase("y"));
	System.out.println("Thank You!");
	}

}
