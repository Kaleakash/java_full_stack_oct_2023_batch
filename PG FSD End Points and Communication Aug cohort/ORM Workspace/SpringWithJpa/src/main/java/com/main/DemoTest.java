package com.main;

import java.util.Iterator;
import java.util.List;
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
		System.out.println("1:Add Employee 2:Delete Employee 3 :Update 4 : Search Employee"
				+ "5: Find All Employee 6 :Find All Employee By Salary");
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
		case 2 :System.out.println("Enter the id");
		        id = sc.nextInt();
		        result = es.deleteEmployee(id);
		        System.out.println(result);
		        break;
		case 3: System.out.println("Enter the id");
				id = sc.nextInt();
				System.out.println("Enter the name");
				name = sc.next();
				System.out.println("Enter the salary");
				salary = sc.nextFloat();
				Employee emp2 = (Employee)ac.getBean("employee");
				emp2.setId(id);
				emp2.setName(name);
				emp2.setSalary(salary);
				result = es.updateEmployee(emp2);
				System.out.println(result);
				break;
		case 4:	System.out.println("Enter the id");
        		id = sc.nextInt();
        		result = es.findEmployee(id);
        		System.out.println(result);
        		break;
		case 5:System.out.println("Find AllEmployee details");
		       List<Employee> listOfEmp1 = es.findAllEmloyee();
		       Iterator<Employee> li1 = listOfEmp1.iterator();
		       while(li1.hasNext()) {
		    	   Employee emp3 = li1.next();
		    	   System.out.println(emp3);
		       }
		       break;
		case 6:  System.out.println("Enter the salary");
		         salary = sc.nextFloat();
				System.out.println("Find AllEmployee details");
				List<Employee> listOfEmp2 = es.findAllEmloyeeBySalary(salary);
				Iterator<Employee> li2 = listOfEmp2.iterator();
				while(li2.hasNext()) {
					Employee emp4 = li2.next();
					System.out.println(emp4);
				}
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
