package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	Map mm  = new HashMap();			// unorder allow null key and value  
	//Map mm = new LinkedHashMap();		// order allow null key and value 
	//Map mm = new TreeMap();		// TreeMap key must be same data type. doesn't allow null  
	//Map mm = new Hashtable();			// method are synchronized. doesn't allow null 
	mm.put(null,null);
	mm.put(2, "Ravi");
	mm.put(1, "Mahesh");
	mm.put(3,"Rajesh");
	//mm.put("A", "B");
	System.out.println(mm);
	mm.put(1, "Raju");
	mm.put(5, "Ravi");
	System.out.println(mm);
	System.out.println("Check Key "+mm.containsKey(1));
	System.out.println("Check Value "+mm.containsValue("Ravi"));
	System.out.println("Using key we can get value "+mm.get(2));
	System.out.println("Using key we can get value "+mm.get(200));
	}

}
