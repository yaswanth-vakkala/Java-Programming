package cls_java;

public class Unary_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b;
		//pre-increment operator
		b = ++a;//increment value by 1 and then assign
		System.out.println(b);
		System.out.println(a);
		//post-increment
		a= 10;
		b = a++;
		System.out.println(b);
		System.out.println(a);
		a=10;
		b=0;
		System.out.println("______");
		//pre-decrement
		b = --a;
		System.out.println(b);
		System.out.println(a);
		//post-decrement
		a=10;
		b = a--;
		System.out.println(b);
		System.out.println(a);
		//
		System.out.println("__________");
		a=10;
		b = a++ + a++ + a++;
		System.out.println(b);
		System.out.println(a);
		//
		a=10;
		b=a+++a+++a++;
		System.out.println(b);
		System.out.println(a);
		a=10;
		b= ++a + ++a + ++a;
		System.out.println(b);
		System.out.println(a);
		a=10;
		b = ++a + a-- + --a;
		System.out.println(b);
		System.out.println(a);
		a=10;
		b = --a + ++a - a++;
		System.out.println(b);
		System.out.println(a);
		
	}

}
