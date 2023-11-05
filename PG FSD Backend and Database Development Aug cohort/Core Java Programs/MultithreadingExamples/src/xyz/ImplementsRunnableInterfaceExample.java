package xyz;
class A implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("A thread "+i);
		}
	}	
}
class B implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("B thread "+i);
		}
	}	
}
public class ImplementsRunnableInterfaceExample {
	public static void main(String[] args) {
	A obj1 = new A();
	B obj2 = new B();		// thread class reference. 
//	obj1.start();			// ready to run ie Runnable state
//	obj2.start();
	Thread t1 = new Thread(obj1);	// passing runnable interface reference as a parameter 
	Thread t2 = new Thread(obj2); 
	t1.start();
	t2.start();
	//t1.start();
	}

}
