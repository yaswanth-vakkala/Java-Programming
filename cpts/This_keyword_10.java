//package helloworld;
//
//class Calc2
//{
//	int num1; //by default 0 value
//	int num2;
//	int result; //instance variable
//	
//	public Calc2(int number1,int number2) // default constructor
//	{
//		num1 =number1;
//		num2 =number2;  // constructor overloading
//	}
//}
//public class This_keyword_10 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Calc2 obj = new Calc2(4,5);
//		System.out.println(obj.num1);
//		System.out.println(obj.num2);
//		
//	}
//
//}


package helloworld;

class Calc2
{
	int num1; //by default 0 value
	int num2;
	int result; //instance variable
	
	public Calc2(int num1,int num2) // default constructor
	{
		this.num1 =num1; // we need to specity left is instance and right is local variable using this
		this.num2 =num2;  //this represent current object
	}
}
public class This_keyword_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc2 obj = new Calc2(4,5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}

}
