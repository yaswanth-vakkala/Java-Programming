package helloworld;
//abstract class - define and declare methods
//interface - declare only - till 1.7 version
//To use big data we need new special features.so java added them by refering scala
//from 1.8 we can define methods in interface
//given a choice always go for interface.difference between abs and intfrace became less.
@FunctionalInterface//no error coz functional interface can only have 1 abstract method
interface Demo //and any no of default methods
{
	void abc();
	default void show() //add default to define method
	{
		System.out.println("in show");
	}
}
class DemoImpl implements Demo
{
	public void abc()
	{
		System.out.println("in abc");
	}
	public void show()//can be overridden
	{
		System.out.println("in new show");
	}
}
public class Default_method_interface_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new DemoImpl();
		obj.abc();
		obj.show();
	}

}
