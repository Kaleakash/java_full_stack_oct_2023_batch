package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	
	// one of the way creating object of hashSet	
	//HashSet hs = new HashSet();	
	//Set ss = new HashSet();		// creating object of sub class 
							// reference of super interface. 
	//Set ss = new LinkedHashSet();
		Set ss = new TreeSet();
	ss.add(4);
	ss.add(2);
	ss.add(1);
	ss.add(6);
	//ss.add("A");
	ss.add(5);
	ss.add(8);
	System.out.println(ss);
	}

}
