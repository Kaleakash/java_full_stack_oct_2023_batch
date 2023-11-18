package com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionRetrieveOperation {

	public static void main(String[] args) {
	// SET API 
		Set ss = new HashSet();
	ss.add(3);ss.add(1);ss.add(4); ss.add("Ravi"); ss.add(7);// auto-boxing : converting primitive to object. 
			System.out.println(ss);
		System.out.println("For each loop");
		for(Object n:ss) {
					System.out.println(n);
		}
		System.out.println("using iterator");
		Iterator ii =  ss.iterator();			// only forward direction
		while(ii.hasNext()) {
			Object obj = ii.next();		
				System.out.println(obj);
		}
		
		
	 //List API 
		List ll = new ArrayList();
		ll.add(30); ll.add(10); ll.add(5); ll.add(40);
		System.out.println(ll);  // as string format , for each, iterator etc
		System.out.println("Using list iterator - forward direction");
		ListIterator li = ll.listIterator();		// forward as well as backward 
		while(li.hasNext()) {
			Object obj = li.next();
			System.out.println(obj);
		}
		System.out.println("Using list iterator - backward direction");
		while(li.hasPrevious()) {
			Object obj = li.previous();
			System.out.println(obj);
		}
		
	// Vector API 
		Vector vv = new Vector();
		vv.add(10);
		vv.add(20);
		vv.add(30);
		System.out.println("from vector");
		System.out.println(vv);
		
		Enumeration ee 	= vv.elements();
		while(ee.hasMoreElements()) {
			Object obj = ee.nextElement();
			System.out.println(obj);
		}
		// Map API 
		Map mm = new HashMap();
		mm.put(1, "Ravi");
		mm.put(3, "Rajesh");
		System.out.println(mm);
		System.out.println("in map one by one ");
//		for(Object obj : mm) {
//			
//		}
		// converting map to set 
		Set keys =  mm.keySet(); // all keys to set 
		Iterator ii1 = keys.iterator();
		while(ii1.hasNext()) {
			Object key = ii1.next();
			System.out.println(" Key "+key+" Value "+mm.get(key));
		}
	}	

}
