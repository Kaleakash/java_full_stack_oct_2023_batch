package com;

class AgeVoteException extends Exception {
	public AgeVoteException() {
		super();		// it call empty constructor of Exception class 
	}
	public AgeVoteException(String msg) {
		//super();		// it call empty constructor of Exception class 
		super(msg);		// we can calling super class parameter constructor to set the message. 
	}
}
public class ThrowKeywordExample {

	public static void main(String[] args) {
		int age=15;
		try {
			
	
		if(age<=21) {
			//throw new Exception();
			//new Exception("Age must be >= 21");
			//throw new AgeVoteException();
			throw new AgeVoteException("Age must be >=21");
		}else {
			System.out.println("You Can Vote!");
		}
		
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}
