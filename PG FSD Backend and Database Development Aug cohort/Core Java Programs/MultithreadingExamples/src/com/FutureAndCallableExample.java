package com;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyClass implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I Came Here");
		return Thread.currentThread().getName();
	}
}


public class FutureAndCallableExample {

	public static void main(String[] args) {
		MyClass mm = new MyClass();
		FutureTask<String> ff = new FutureTask<String>(mm);
		Executor ee = Executors.newSingleThreadExecutor();
		ee.execute(ff);
		
		ff.isDone();
	}

}
