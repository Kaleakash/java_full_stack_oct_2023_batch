package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPIExamples {

	public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>();	
	numbers.add(2);numbers.add(1);numbers.add(6);numbers.add(10);
	numbers.add(3);numbers.add(5);numbers.add(7);numbers.add(22);
	numbers.add(8);numbers.add(11);numbers.add(15);numbers.add(18);
	List<String> names = new ArrayList<>();
	names.add("ravis");names.add("lokesh"); names.add("mahesh");
	Iterator<Integer> li = numbers.iterator();
	while(li.hasNext()) {
		int n = li.next();
		if(n%2!=0) {
			System.out.print(" "+n);
		}
	}
	System.out.println();
	System.out.println("using stream");
//	Stream<Integer> ss = numbers.stream();
//	Stream<Integer> ss1 = ss.filter(v->v%2==0);
//	ss1.forEach(v->System.out.print(" "+v));
	
	//numbers.stream().filter(v->v%2==0).forEach(v->System.out.print(" "+v));
	numbers.stream().map(v->v+100).forEach(v->System.out.print(" "+v));
	//numbers.stream().filter(v->v%2==0).map(v->v+100).forEach(v->System.out.print(" "+v));
	 Optional<String> result =  names.stream().filter(v->v.startsWith("a")).findAny();
	System.out.println();
	 if(result.isPresent()) {
		 System.out.println("yes");
	 }else {
		 System.out.println("no");
	 }
	 names.stream().map(e->e.toUpperCase()).forEach(v->System.out.print(v+" "));
	 boolean resultData = names.stream().allMatch(v->v.contains("s"));
	 System.out.println(resultData);
	}
	

}



