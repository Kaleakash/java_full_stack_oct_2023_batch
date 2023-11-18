package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		// Collection Framework without generics 
//	List ll = new ArrayList();
//	ll.add(10);				// auto- boxing : converting primitive to object. 
//	ll.add("Ravi");
//	ll.add(10.20);
//	ll.add(true);
//	
//	Object obj = ll.get(1);
//	if(obj instanceof String) {
//		String str = (String)obj;
//		System.out.println(str);
//	}
//	if(obj instanceof Integer) {
//		Integer ii = (Integer)obj;
//		int n = ii.intValue();
//		System.out.println(n);
//	}
	// Collection Framework with Generics 
	//CollectionClass<type> object  = new CollectionClass<Type>();
	List<Integer> ss = new ArrayList<Integer>();
	ss.add(10);		// auto-boxing : primitive to object 
	ss.add(20);
	ss.add(30);
	//ss.add("Ravi");
	//ss.add(10.10);
	int n = ss.get(0);	// auto-unboxing : object to primitive 
	System.out.println(n);
	}

}


