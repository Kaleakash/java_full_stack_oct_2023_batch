
public class ArrayExamples {

	public static void main(String[] args) {
	int num1[];				// declaration 
	int num2[]= {10,20,30,40,50};		// declaration with initialization 
	int num3[]=new int[10];		// memory created...
	//System.out.println("Size of array "+num1.length);
	System.out.println("Size of array "+num2.length);
	System.out.println("Size of array "+num3.length);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println("0 index position "+num2[0]);
	System.out.println("1 index position "+num2[1]);
	System.out.println("0 index position "+num3[0]);
	System.out.println("1 index position "+num3[1]);
	System.out.println("1 index position "+num3[9]);
	num3[0]=100;
	num3[1]=200;
	System.out.println("0 index position "+num3[0]);
	System.out.println("1 index position "+num3[1]);
	}

}
