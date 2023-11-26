package com;
interface A {
		void dis1();
	default void dis2() {
		System.out.println("This is default method dis1");
	}
	static void dis3() {
		System.out.println("This is static method");
	}
	default void dis4() {
		System.out.println("This is default method dis4");
	}
}
class B implements A {
	@Override
	public void dis1() {
		System.out.println("provided body for dis1 method");
	}
	@Override
	public void dis2() {
		System.out.println("We are overriding default method dis2");
	}
//	@Override
//	public void dis3() {
//		System.out.println("We can't override the static ");
//	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		B obj1 = new B();
		obj1.dis1();
		obj1.dis2();
		obj1.dis4();
		A.dis3();   // static method part of interface we need to call through interface name. 
	}

}
