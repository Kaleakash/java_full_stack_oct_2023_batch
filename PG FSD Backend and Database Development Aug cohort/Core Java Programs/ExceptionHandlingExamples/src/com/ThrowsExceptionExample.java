package com;

public class ThrowsExceptionExample {

//	static void display1() throws Exception{
//		//try {
//		int res = 100/0;
//		//}catch(Exception e) {}
//		System.out.println("Display1 method");
//	}
//	static void display2() throws Exception{
//		try {
//		display1();
//		}catch(Exception e) {}
//		System.out.println("Display2 method");
//	}
//	public static void main(String[] args) throws Exception{
//		//try {
//		display2();
//		//}catch(Exception e) {}
//		System.out.println("Main method");
//
//	}
	
	static void display1() throws Exception{
		try {
		int res = 100/0;
		}catch(ArithmeticException e) {}
		System.out.println("Display1 method");
	}
	static void display2() throws Exception{
		try {
		display1();
		}catch(ArrayIndexOutOfBoundsException e) {}
		System.out.println("Display2 method");
	}
	public static void main(String[] args) throws Exception{
		//try {
		display2();
		//}catch(Exception e) {}
		System.out.println("Main method");

	}

}
