package cls_java;

public class Task_unary_opers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b = ++a + a-- + --a;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		//
		a = 10;
		b = --a + ++a - a++;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		//
		int c = ++b - --a + b++;
		System.out.println("c= "+c);
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		//
		a = 10;
		System.out.println("a++="+a+++"++a="+ ++a+" a--"+a--);
		b=20;
		System.out.println("--b="+--b+"b--="+b--+"b++="+b++);
		a = -10;
		System.out.println(" --a="+(--a)+" a--="+(a--)+" ++a="+(++a));
		b=-20;
		System.out.println("b--="+ b-- +" ++b="+ ++b + " --b="+ --b);
		System.out.println(a);
		System.out.println(b);
		a = 30;
		System.out.println(a += 100);
		System.out.println(a /= 10);
		System.out.println(a *= 5);
	}

}
