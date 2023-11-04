package abc;
class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("A thread "+i);
		}
	}
	
}
class B extends Thread{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("B thread "+i);
		}
	}
	
	
}
public class ExtendsThreadClassExample {
	public static void main(String[] args) {
	A obj1 = new A();
	B obj2 = new B();		// thread class reference. 
	obj1.start();			// ready to run ie Runnable state
	obj2.start();
	}

}
