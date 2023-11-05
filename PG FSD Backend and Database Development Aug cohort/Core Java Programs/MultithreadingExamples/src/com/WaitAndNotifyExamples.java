package com;

class Resource implements Runnable {
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int i=0;i<=10;i++) {
		System.out.println(name+" "+i);
		try {
		Thread.sleep(500);
		if(i==5 && name.equals("Ravi")) {
			wait();
		}
		if(i==7 && name.equals("Steven")) {
			notify();
			wait();
		}
		}catch(Exception e) {}
	}
	}
}
public class WaitAndNotifyExamples {
	public static void main(String[] args) {
	Resource rr = new Resource();
	Thread t1 = new Thread(rr);
	Thread t2 = new Thread(rr);
	Thread t3 = new Thread(rr);
	t1.setName("Ravi");
	t2.setName("Steven");
	t3.setName("Ajay");
	t1.start();
	t2.start();
	t3.start();
	}

}
