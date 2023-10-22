
public class TypeCastingExample {

	public static void main(String[] args) {
//		byte a=10;
//		short b=a;	// implicit type casting 
//		System.out.println("a "+a);
//		System.out.println("b "+b);
//		short c=129;			//-32767 to 32768
//		//byte d = (type)c;
//		byte d = (byte)c;		// explicit type casting -128 to 127 
//		System.out.println("c "+c);
//		System.out.println("d "+d);
//		int e = 100;
//		float f = e;	// implicit type casting 
//		System.out.println("e "+e);
//		System.out.println("f "+f);
//		//float g = 100.0;
//		//double g = 100.10;
//		//float g = (float)100.10;
//		float g = 100.10f;		// explicit type casting 
//		int i = (int)g;		// explicit type casting 
//		System.out.println("g "+g);
//		System.out.println("i "+i);
		int a=10;
		int b=3;
		int div1 = a/b;
		float div2 = a/b;
		float div3 = (float)a/b;
		System.out.println("div1 "+div1);
		System.out.println("div2 "+div2);
		System.out.println("div3 "+div3);
	}

}
