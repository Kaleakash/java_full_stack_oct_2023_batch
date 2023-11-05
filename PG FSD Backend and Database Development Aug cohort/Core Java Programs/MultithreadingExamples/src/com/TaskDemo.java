package com;
class Task implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("In Run method "+t);
	}
}
public class TaskDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		ThreadGroup tg1 = new ThreadGroup("group1");
		ThreadGroup tg2 = new ThreadGroup("group2");
		System.out.println(" In Main method "+t);
	Task tt = new Task();
	Thread t1 = new Thread(tg1,tt);		// group1
	Thread t2 = new Thread(tg1,tt);		// group1
	Thread t3 = new Thread(tg2,tt);		// group2
	Thread t4 = new Thread(tt);			// main 
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	tg1.list();
	tg2.list();
	}

}
