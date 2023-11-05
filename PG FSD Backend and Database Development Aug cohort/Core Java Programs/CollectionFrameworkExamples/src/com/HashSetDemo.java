package com;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		System.out.println("Size "+hs.size());
		hs.add(10);
		hs.add(10.10);
		hs.add("Ravi");
		hs.add(true);
		System.out.println("Size "+hs.size());
		System.out.println(hs);  // it will display the output in string format. 
		System.out.println("Search "+hs.contains(10));
		System.out.println("Search "+hs.contains(100));
		hs.remove(10);
		System.out.println(hs);
	}

}
