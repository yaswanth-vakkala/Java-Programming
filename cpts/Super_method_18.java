package helloworld;

class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
//		super(); by default
		System.out.println("in B");
	}
	public B(int i)
	{
//		super(); by default
		super(i);
		System.out.println("in B int");
	}
}
public class Super_method_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B obj1 = new B();
		B obj1 = new B(6);
		
	}

}
