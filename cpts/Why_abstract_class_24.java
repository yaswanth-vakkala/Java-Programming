package helloworld;

class Printer
{
//	public void show(Integer i)
//	{
//		System.out.println(i);
//	}
//	public void show(Double i)
//	{
//		System.out.println(i);//instead of using these 2 methods for 2 inputs
//make one method that accepts both.
//	}
	public void show(Number i)//numbers is abstract class whitch int,double extends from
	{//superclass accepts all subclass objs
		System.out.println(i);
	}
}

public class Why_abstract_class_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj = new Printer();
		obj.show(5);
		obj.show(5.5);
	}

}
