package cls_java;

public class Type_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		float n1 = (float)a;
		float n2 = a;
		System.out.println(a);
		System.out.println(n1);//external type casting
		System.out.println(n2);//internal
		short s = 10;
		int n3 = s;//internal
		System.out.println(s);
		System.out.println(n3);
		
//byte-shrot-int-long-float-double//possible
//reverse is not possible in internal but in external data may get lost,ex-double to int)
	}

}
