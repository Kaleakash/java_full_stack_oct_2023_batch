package com;

public class StringDemo {

	public static void main(String[] args) {
	String name1 = "Ravi Kumar";			// creating object using literal style 
	String name2 = "Ravi Kumar";
	String name3 = new String("Ravi Kumar");	// creating object usign new keyword 
	String name4 = new String("Ravi Kumar");
	System.out.println(name1);
	System.out.println(name2);
	System.out.println(name1.length());
	System.out.println(name2.length());
	if(name1.equals(name4)) {
		System.out.println("Equal");
	}else {
		System.out.println("Not Equal");
	}
	String name5="   ";
	System.out.println(name5.isBlank());
	String name6 = "Java";
	System.out.println(name6.repeat(5));
	String name7 = "  Akash ";
	System.out.println(name7.length());
	System.out.println(name7.strip().length());
	System.out.println(name7.stripLeading().length());
	String msg = "Welcome to java";
	msg.lines().forEach(e->System.out.println(e));
	}

}
