package com.bean;

public class Employee {
private int id;
private String name;
private float salary;
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
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

//@Override
//public boolean equals(Object obj) {
//	Employee emp =(Employee)obj;
//	if(this.id==emp.id) {
//		return true;
//	}else {
//		return false;
//	}
//	
//}
//@Override
//public int hashCode() {
//	System.out.println("I came here");
//	return 100;
//}

}




