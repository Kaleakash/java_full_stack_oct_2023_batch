package abc;
interface Hello {
	void info();
	//void info1();
}
class HelloImp implements Hello {
	public void info() {
		System.out.println("Provided body for info method using HelloImp class");
	}
}
public class SimpleLambdaDemo {
	public static void main(String[] args) {
	// 1st way : created extra class which implements interface 
		Hello h1 = new HelloImp();
		h1.info();
		
	// 2nd way : using anonymous inner class 
		Hello h2 = new Hello() {
			public void info() {
				System.out.println("Provided body for info method using anonymous class");
			}
		};
		h2.info();
		// 2nd way : using anonymous inner class 
				Hello h3 = new Hello() {
					public void info() {
						System.out.println("Provided body for info method using anonymous class different logic");
					}
				};
				h3.info();
		//3rd way : using lambda expression ie anonymous method 
		Hello h4 = ()->System.out.println("Lambda expression example");
		h4.info();
	}
}
