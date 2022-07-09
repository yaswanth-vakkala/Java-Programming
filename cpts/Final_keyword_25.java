package helloworld;
//final keyword can be used with variables,methods,classes
class A3
{
	//for var
	final int DAY =2;//once var made final it becomes constant
	public A3()
	{
//		DAY=10; error.we can assign value here by just declaring above and the it becomes conts
	}
}
public class Final_keyword_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 obj = new A3();
		System.out.println(obj.DAY);
		
	}

}
