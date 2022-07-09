package helloworld;
//single level inheritence
class Calcs1  //superclass ,parent, base
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class Calcs2 extends Calcs1  //subclass, child, derived
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

public class Inheritance_17 {
	public static void main(String[] args)
	{
		Calcs2 c1= new Calcs2();
		int result1 = c1.add(5,4);
		int result2 = c1.sub(5, 4);
		
		System.out.println(result2);
		System.out.println(result1);
	}
}
