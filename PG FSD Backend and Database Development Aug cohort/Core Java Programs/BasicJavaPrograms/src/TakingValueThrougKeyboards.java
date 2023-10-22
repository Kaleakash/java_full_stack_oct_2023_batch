
import java.util.Scanner;
public class TakingValueThrougKeyboards {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter the value of a ");
//		int a = obj.nextInt();
//		System.out.println("Enter the value of b ");
//		int b = obj.nextInt();
//		int sum = a+b;
//		System.out.println("sum of two number is "+sum);
//		obj.close();
		String msg = "Welcome to Java";
		System.out.println(msg);
		System.out.println("Enter the id");
		int id = obj.nextInt();		//int value 
		System.out.println("Enter the name");
		String name = obj.next();		// string value 
		System.out.println("Enter the salary");
		float salary = obj.nextFloat();		// float salary
		System.out.println("Enter the result");
		boolean result = obj.nextBoolean();
		System.out.println("Employee details ");
		System.out.println("Id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		System.out.println("result is "+result);
		
		obj.close();
		
	}

}
