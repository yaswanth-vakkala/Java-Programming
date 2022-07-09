package helloworld;

class Calc
{
	int num1;
	int num2;
	int result;
	
	public void perform() //returns nothing - void
	{
		result = num1 + num2;
	}
}
public class Class_object_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj = new Calc(); // reference(not object); //new allocates memory
		// object knows something and does something
		obj.num1 = 3;
		obj.num2 = 5;
		obj.perform();
		System.out.println(obj.result);
		
	}

}
