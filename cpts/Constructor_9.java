package helloworld;

class Calc1
{
	int num1; //by default 0 value
	int num2;
	int result; //instance variable
	
	public Calc1() // default constructor
	{
		num1 =5;
		num2 =5;  // constructor overloading
	}
	public Calc1(int k) //parameterized constructors
	{
		num1 = k;
		num2 = k;
	}
}
public class Constructor_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 obj = new Calc1(9); // reference(not object); //new allocates memory // constructor
		// object knows something and does something
		//by default Calc is given construcor by java for allocating memory
		System.out.println(obj.num1);
	}

}
