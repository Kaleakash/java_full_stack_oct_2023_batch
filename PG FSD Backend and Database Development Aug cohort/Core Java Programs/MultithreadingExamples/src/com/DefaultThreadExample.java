package com;

public class DefaultThreadExample {

	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	t.setName("My Thread");
	t.setPriority(1);
	System.out.println(t);  
	t.setPriority(Thread.MAX_PRIORITY);	// max = 10, min=1, norm =5
	System.out.println(t);
	String name = t.getName();
	int i = t.getPriority();
	ThreadGroup tg	= t.getThreadGroup();
	System.out.println("name "+name);
	System.out.println("priority "+i);
	System.out.println("group name "+tg.getName());
	}

}
