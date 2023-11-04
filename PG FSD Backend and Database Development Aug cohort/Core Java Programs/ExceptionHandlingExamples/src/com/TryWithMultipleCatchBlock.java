package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result1 = 100/1;
			int abc[]= {10,20};
			int result2 = abc[1];
			System.out.println("No Exception");
		} catch (ArithmeticException e) {
			System.out.println("Divided by exception "+e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index position "+e.toString());
		}
		
		System.out.println("Normal Set of statements");
	}

}
