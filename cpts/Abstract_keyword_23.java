package helloworld;
//we can use abstract in a class or method
//abstract class is made so that no one can make a obj from it.it is just created to be extended by other classes
abstract class Human //abstract class
{
	public abstract void eat();//we declared method instead of defining
	public void walk()
	{
		
	}
}
class Man extends Human //concrete class
{
	//compulsury to define methods
	public void eat()
	{
		
	}
}
public class Abstract_keyword_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Human obj = new Human(); error coz abstract class
		Human obj = new Man();//human ref and man obj
	}

}
