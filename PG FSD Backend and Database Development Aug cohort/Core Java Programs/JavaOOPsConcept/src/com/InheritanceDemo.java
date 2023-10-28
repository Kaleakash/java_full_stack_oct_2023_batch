package com;

class A {				// A class is super class 
	void dis1() {
		System.out.println("A class method");
	}
}

class B extends A{			// B class is sub class 
	void dis2() {
		System.out.println("B class method");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.dis1();
		
		//obj1.dis2();
		
		B obj2 = new B();
		obj2.dis2();
		obj2.dis1();
	}

}
