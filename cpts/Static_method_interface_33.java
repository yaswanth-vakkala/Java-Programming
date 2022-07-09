package helloworld;
//new concepts in java 8
@FunctionalInterface
interface Demo2
{//now in interface we can have static methods we dont need to call an obj anymore
	int num=9;//by default var created in interface becomes const
	void abc();
	static void show()//static method
	{//we can have default,static,abstract methods
		System.out.println("hola");
	}
}
class Demoimp2 implements Demo2
{
	public void abc()
	{
//		num = 7;
	}
}
public class Static_method_interface_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2.show();
	}

}
