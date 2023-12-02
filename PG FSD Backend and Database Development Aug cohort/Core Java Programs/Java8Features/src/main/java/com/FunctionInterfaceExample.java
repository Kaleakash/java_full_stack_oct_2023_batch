package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class MyFunctional implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		
		return "Your number is "+t;
	}
}
class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String t) {
		System.out.println("your name is "+t);
	}
}
public class FunctionInterfaceExample {
	public static void main(String[] args) {	
		// without labmda 
		Function<Integer, String> ff1 = new MyFunctional();
		System.out.println(ff1.apply(100));
		
		Function<Integer, String> ff2 = (t)->"Your number is "+t;
		System.out.println(ff2.apply(200));
		
		Function<String, String> ff3 = (t)->"Welcome user "+t;
		System.out.println(ff3.apply("Ravi"));
		List<String> names = new ArrayList<>();
		names.add("Ravi"); names.add("Lokesh"); names.add("Mahesh"); names.add("Steven");
		System.out.println(names);
		Iterator<String> li = names.iterator();
		while(li.hasNext()) {
			String name = li.next();
			System.out.println(name);
		}
		Consumer<String> cc = new MyConsumer();
		names.forEach(cc);
		names.forEach(v->System.out.println("Your name is in lambda "+v));
	}
	

}
