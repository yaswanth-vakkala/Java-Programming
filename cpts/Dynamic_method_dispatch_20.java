package helloworld;

class A2
{
	public void show()
	{
		System.out.println("in A");
	}
}
class B2 extends A2
{
	public void show()
	{
		System.out.println("in B");
	}
	public void config()
	{
		System.out.println("config");
	}
}
class C2 extends A2
{
	public void show()
	{
		System.out.println("in C");
	}
}
public class Dynamic_method_dispatch_20 {
//think of runtime and complie time polymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj1 = new B2(); //only linked at runtime not compile time
		obj1.show();//which show to show decided by runtime
//		obj1.config();
		
		obj1 = new C2();
		obj1.show();// dynamic method dispacth to achevie this folow runtime
	}//runtime poly or method overriding

}
