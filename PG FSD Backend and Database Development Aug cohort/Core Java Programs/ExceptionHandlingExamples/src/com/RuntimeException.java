package com;

public class RuntimeException {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		try {
			int res = a/b;
		System.out.println("Result is "+res);
		}catch(Exception e) {
			//System.out.println("I Take Care!");		// custom message 
			//System.out.println(e.getMessage());		// pre defined message 
			System.out.println(e.toString());			// name of exception and msg
		}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}

}
