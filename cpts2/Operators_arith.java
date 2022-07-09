package cls_java;

public class Operators_arith {//as class is public file and class name should be same
//if class is not public class and file name can be different.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		double b =2;//when arith operation performed between 2 datatypes result will be of data type with high memory allocation
		int c=(int)(a/b);//typecasting
		double d = a/b;
		System.out.println("a+b = "+(a+b));
		System.out.println("a/b = "+c);
		System.out.println("a/b = "+d);
		System.out.println(a/b);
		System.out.println(a%b);//reminder
		//in c and c++ mod operation throws error
		
	}

}
