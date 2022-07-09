package helloworld;

interface Demo1 //and any no of default methods
{
	void abc();
	default void show() //add default to define method
	{
		System.out.println("in show");
	}
}

interface Mydemo1
{
	default void show()//can be overridden
	{
		System.out.println("in new show");
	}
}
class DemoImpl1 implements Demo1,Mydemo1
{
	public void abc()
	{
		System.out.println("in abc");
	}
//	public void show()//this is 1st way to solve the multiple inheritence problem
//	{
//		System.out.println("in demoimpl show");
//	}
//2nd option is click on error and override default method in one of classes	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Demo1.super.show();
	}
}
public class MultipleInheritenceIssue_interface_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 obj = new DemoImpl1();
		obj.abc();
		obj.show();
	}
//this problem arises in java 8
}
