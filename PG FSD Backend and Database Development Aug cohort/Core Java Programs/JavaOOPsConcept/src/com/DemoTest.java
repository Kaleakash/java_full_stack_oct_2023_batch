package com;

public class DemoTest {

	public static void main(String[] args) {
		//id=100;
		//display();
		Employee emp = new Employee();
//		emp.id=100;
//		emp.name="Ravi";
//		emp.salary=-12000;
		emp.setValue(100, "Ravi", -12000);
		emp.display();
		Customer c1 = new Customer();
		c1.setCid(100);
		c1.setCname("Ramesh");
		c1.setAge(-21);
		
		Customer c2 = new Customer(101, "Raju", 26);
		
		System.out.println("id is "+c1.getCid());
		System.out.println("name is "+c1.getCname());
		System.out.println("age is "+c1.getAge());
		
		System.out.println("id is "+c2.getCid());
		System.out.println("name is "+c2.getCname());
		System.out.println("age is "+c2.getAge());
	}

}
