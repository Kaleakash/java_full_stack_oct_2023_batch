
public class SwitchExample {

	public static void main(String[] args) {
		char symbol = '(';
		int a=10;
		int b=5;
		switch (symbol) {
		case '+':System.out.println(a+b);
				break;
		case '-':System.out.println(a-b);
				break;
		case '*':System.out.println(a*b);
				break;
		case '/':System.out.println(a/b);
				break;
		default:System.out.println("Wrong choice");
			break;
		}
		System.out.println("finish");
	}

}
