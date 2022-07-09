package cls_java;

public class Operators_shifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -10;//can be +ve and -ve int
		int b = a<<3;//left shift operator << - right operand can only be +ve int
		System.out.println(b);
		System.out.println("_________");
		a = -25;
		b = a >> 5;//right shift operator
		System.out.println(b);
		a =-5;
		int c = a >>> 2;//unsigned right shift operator- no matter the input output will be +ve
		System.out.println(c);
		a=3;
		b=~a;//compliment bitwise operator
		System.out.println(b);//input a + 1 in -ve sign(only works for +ve int)
		a = -4;
		b=~a;//~ bitwise compliment tail
		System.out.println(b);//before int with +ve sign
		
	}

}
