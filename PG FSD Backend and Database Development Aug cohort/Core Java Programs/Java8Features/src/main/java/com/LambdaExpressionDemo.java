package com;
@FunctionalInterface
interface Operation {
	public int add(int x, int y);
	//public int sub(int x, int y);
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
	Operation op1 = (x,y)->x+y;
	System.out.println("Addition "+op1.add(10, 20));
	Operation op2 = (a,b)->a+b;
	System.out.println("Addition "+op2.add(1, 2));
	Operation op3 = (int x, int y)->x+y;
	System.out.println("Addition "+op3.add(100, 200));
	Operation op4= (int x, int y)->{
		int sum = x+y;
		return sum;
	};
	System.out.println("Addition "+op4.add(1000, 2000));
	}

}
