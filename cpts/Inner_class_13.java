package helloworld;

class Outer
{
	int a; //member variable
	public void show() //member method
	{
		System.out.println("in outer");
	}
	
	class Inner //member class
	{ // only purpose of inner class is to work with outer class
		public void display()
		{
			System.out.println("in display");
		}
	}
}

public class Inner_class_13 {
	
	//inside class we can have variables,methods,class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner(); 
		obj1.display();
	}
	//no of classes in the file define no of classfiles in file
	//if we compile the file it gives 3 classfiles with names
	//Outer.class,Outer$Inner.class,Inner_class_13.class - check in src or bin
	//we can also have static classes
	// syntax to access- Outer.Inner obj1 = new Outer.Inner();
	//Types of inner class - 1.member class 2.static 3. anonymous
}
