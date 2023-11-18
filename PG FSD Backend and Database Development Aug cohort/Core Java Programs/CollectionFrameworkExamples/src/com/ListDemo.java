package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListDemo {

	public static void main(String[] args) {
	// Stack 	: FILO or LIFO 
//		Stack ss = new Stack();
//		ss.push(100);
//		ss.push(200);
//		ss.push(300);
//		System.out.println(ss);
//		System.out.println("top most element "+ss.peek());
//		System.out.println(ss);
//		System.out.println("top most element "+ss.pop());
//		System.out.println(ss);
//		System.out.println("Search "+ss.search(300));
//		System.out.println("Search "+ss.search(200));
//		System.out.println("Search "+ss.search(100));
		
//		List ll = new ArrayList();
//		ll.add(2);
//		ll.add(10);
//		ll.add(5);
//		ll.add(9);
//		System.out.println(ll);
//		System.out.println("Get value using index position "+ll.get(0));
//		System.out.println("Get value using index position "+ll.get(1));
//			ll.add(1, 100);		// index, value 
//		System.out.println("After added...");
//		System.out.println("Get value using index position "+ll.get(1));
//		System.out.println("Get value using index position "+ll.get(2));
//		ll.remove(2);	// remvove using index 
//		Integer obj = 2;
//		ll.remove(obj); // remove base upon value
//		System.out.println("After remove");
//		System.out.println(ll);
		
		//List ll = new LinkedList();
		LinkedList ll = new LinkedList();
		ll.add(2);
		ll.add(10);
		ll.add(5);
		ll.add(9);
		System.out.println(ll);
		System.out.println("Get value using index position "+ll.get(0));
		System.out.println("Get value using index position "+ll.get(1));
			ll.add(1, 100);		// index, value 
		System.out.println("After added...");
		System.out.println("Get value using index position "+ll.get(1));
		System.out.println("Get value using index position "+ll.get(2));
		ll.remove(2);	// remvove using index 
		Integer obj = 2;
		ll.remove(obj); // remove base upon value
		System.out.println("After remove");
		System.out.println(ll);
		System.out.println("First "+ll.getFirst());
		System.out.println("First "+ll.getLast());
		ll.removeLast();		// ll.remove(ll.size()-1);
		System.out.println(ll);
		
	}

}
