package com;
class Abc {
	int a; // instance or non static 
	static int b;
	void dis1() {
		System.out.println("Non static method");
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	static void dis2() {
		System.out.println("static method");
		//System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
class Test {
	int a;
	static int b;
	void dis() {
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
public class StaticKeywordExample {
	public static void main(String[] args) {
//		Abc obj = new Abc();
//		obj.a=100;
//				Abc.b=200;
//				obj.b=300;
//		obj.dis1();
//				Abc.dis2();
//				obj.dis2();
			Test t1 = new Test();
				Test t2 = new Test();
					t1.a=100;
						t1.b=200;
							Test.b=300;
	
								t2.a=400;
									t2.b=500;
										Test.b=600;
	t1.dis();		// a=100, b=600
	t2.dis();		// a= 400, b=600
	}

}
