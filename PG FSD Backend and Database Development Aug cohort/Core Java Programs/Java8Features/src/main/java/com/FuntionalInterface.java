package com;
@FunctionalInterface
interface Abc {
	void dis1();
	default void dis2() {
		System.out.println("default method");
	}
	static void dis3() {
		System.out.println("static method");
	}
	//void dis4();
}
public class FuntionalInterface {
	public static void main(String[] args) {
		
	}
}
