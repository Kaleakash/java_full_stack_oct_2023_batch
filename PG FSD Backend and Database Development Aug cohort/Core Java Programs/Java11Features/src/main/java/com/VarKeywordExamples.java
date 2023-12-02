package com;
interface Operation {
	public int add(int x, int y);
}
public class VarKeywordExamples {

	public static void main(String[] args) {
		Operation op1 = new Operation(){
			public int add(int x, int y) {
				return x+y;
			}
		};
		System.out.println(op1.add(10, 20));
		
		// java 11 features 
		var op2 = new Operation(){
			public int add(int x, int y) {
				return x+y;
			}
		};
		System.out.println(op2.add(10, 20));
		
			Operation op3 = (int x, int y)->x+y;
		System.out.println(op3.add(1, 2));
			Operation op4 = (var x, var y)->x+y;
		System.out.println(op4.add(1, 2));
		var a=10;
		//a="Ravi";
	}

}
