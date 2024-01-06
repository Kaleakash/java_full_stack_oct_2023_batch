package com;

public class Employee {
private int id;
private String name;
private float salary;
private Address address;		// Employee has a address reference ie has relationship. 	
	public Employee() {
		System.out.println("object created...using empty");
	}

	public Employee(int id, String name, float salary) {
		System.out.println("object created ..using parameter");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(int id, String name, float salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("This is employee class method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
}
