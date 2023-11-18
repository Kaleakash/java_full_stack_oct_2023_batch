package com;

import java.util.Stack;

public class ListDemo {

	public static void main(String[] args) {
	// Stack 	: FILO or LIFO 
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		System.out.println(ss);
		System.out.println("top most element "+ss.peek());
		System.out.println(ss);
		System.out.println("top most element "+ss.pop());
		System.out.println(ss);
		System.out.println("Search "+ss.search(300));
		System.out.println("Search "+ss.search(200));
		System.out.println("Search "+ss.search(100));
	}

}
