package com.main;

import java.util.Scanner;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many records do you want to store");
		int n = sc.nextInt();
		Employee employee[]=new Employee[n];//3
		System.out.println("Enter the records one by one");
		for(int i=0;i<n;i++) {
			employee[i]=new Employee();
			System.out.println("Enter the id ");
			int id = sc.nextInt();
			employee[i].setId(id);
			System.out.println("Enter the name ");
			String name = sc.next();
			employee[i].setName(name);
			System.out.println("Enter the salary ");
			float salary = sc.nextFloat();
			employee[i].setSalary(salary);
		}
		// business logic 
		System.out.println("All Employee records are");
		for(int i=0;i<n;i++) {
			System.out.println(" id "+employee[i].getId());
			System.out.println(" name "+employee[i].getName());
			System.out.println(" salary "+employee[i].getSalary());
		}
	}

}
