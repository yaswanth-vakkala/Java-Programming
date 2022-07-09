package helloworld;

class A1
{
	public void show()
	{
		System.out.println("in A");
	}
}
class B1 extends A1
{
	@Override //annotation for notifying overriding
	//if you make logical(spelling) mistake in child method like super1
	public void show()
	{//child class method overriding parent method
		super.show();//for calling parent method too we can override any parent object like int,method etc
		System.out.println("in B");
	}
}
public class Method_overriding_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj1 = new B1();
		obj1.show();
	}

}
