package com;

public class Employee {
private int id;
private String name;
private float salary;
	
	public Employee() {
		System.out.println("object created...using empty");
	}

	public Employee(int id, String name, float salary) {
		System.out.println("object created ..using parameter");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("This is employee class method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
