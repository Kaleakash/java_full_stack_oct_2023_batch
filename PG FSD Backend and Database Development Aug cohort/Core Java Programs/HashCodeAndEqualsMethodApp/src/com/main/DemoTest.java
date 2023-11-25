package com.main;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		// == it check value as well as memory code 
		// .equals check only value. 
//	String name1 = "Ravi";
//	String name2 = "Ravi";		// literal style 
//	String name3 = new String("Ravi");		// new memory 
//	String name4 = new String("Ravi");		// new memory 
//	if(name1.equals(name4)) {
//		System.out.println("Equal");
//	}else {
//		System.out.println("Not Equal");
//	}
	Employee emp1 = new Employee(100, "Ravi", 12000);		// heap memory 
	Employee emp2 = new Employee(100, "Ravi", 12000);		// heap memory 
	if(emp1.equals(emp2)) {		// calling object equals methods. 
		System.out.println("Equal");
	}else {
		System.out.println("Not Equal");
	}
	}

}
