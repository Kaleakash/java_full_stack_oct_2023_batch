package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
		System.out.println("1:Add Employee 2 : Delete Employee 3: Update Employee 4: Retrieve Employee as Map "
				+ "5: Retrieve Employee by Salar Condition"
				+ "6:Retrieve Employee as List 7 : Retrieve Employee as List with Salary Condition");
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
		case 4 : List<Map<String, Object>> ll= es.findAllEmployeeAsMap();
		         Iterator<Map<String,Object>> li  = ll.iterator();
		         while(li.hasNext()) {
		        	 Map<String,Object> mm  = li.next();
		        	 System.out.println(mm);
		         }
		         break;
		case 5 :System.out.println("Enter the salary");
		        salary = sc.nextFloat();
				List<Map<String, Object>> ll1= es.findAllEmployeeAsMapBySalary(salary);
				Iterator<Map<String,Object>> li1  = ll1.iterator();
				while(li1.hasNext()) {
					Map<String,Object> mm  = li1.next();
					System.out.println(mm);
				}
				break;
		case 6 :List<Employee> listOfEmployees = es.findAllEmployeeAsList();
				Iterator<Employee> li2 = listOfEmployees.iterator();
				while(li2.hasNext()) {
					Employee emp = li2.next();
					System.out.println("id is "+emp.getId()+" Name is "+emp.getName()+" Salary "+emp.getSalary());
				}
				break;
		case 7 : 
				System.out.println("Enter the salary");
				salary = sc.nextFloat();
			List<Employee> listOfEmployees1 = es.findAllEmployeeAsListBySalary(salary);
			Iterator<Employee> li3 = listOfEmployees1.iterator();
			while(li3.hasNext()) {
			Employee emp = li3.next();
			System.out.println("id is "+emp.getId()+" Name is "+emp.getName()+" Salary "+emp.getSalary());
			}
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
