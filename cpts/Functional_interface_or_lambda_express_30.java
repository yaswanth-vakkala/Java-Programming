package helloworld;
//types of interface
//1. normal - interface with more than 1 method
//2. single abstract method - interface with 1 method
//3. marker interface - interface with no method - ex: serializable interface
//in latest version of java (>1.7) we focus most on java 8 concepts, sam interface is called function interface in java 8
//functional interfaces are imp coz we can use lambda expressions with them. 
//lambda exp come from scala language
//@FunctionalInterface  //optional annotation to make sure we make a functional interface
interface Abc2//functional interface
{
	void show();
}
public class Functional_interface_or_lambda_express_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abc2 obj = new Abc2()
//				{
//					public void show()
//					{
//						System.out.println("im the best");
//					}
//				};
		Abc2 obj = () -> System.out.println("im the best");
//here we removed code coz we already know it is most probable code in that place then why write it again
//it comes fro scala.just do it in a single line.this is only possible for functional interfaces and the only work in java8
//need curly brackes for more than 1 statement
		obj.show();
	}

}
