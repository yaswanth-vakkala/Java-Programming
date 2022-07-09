package helloworld;
//single level inheritence
class Calcc1  //superclass ,parent, base
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class Calcc2 extends Calcc1  //subclass, child, derived
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class Calcc3 extends Calcc2 //IS-A type
{
	public int multi(int i, int j)
	{
		return i*j;
	}
}
public class Multilevel_inheritence_17 {  //HAS - A type
	public static void main(String[] args)
	{
		Calcc3 c1= new Calcc3();
		int result1 = c1.add(5,4);
		int result2 = c1.sub(5, 4);
		int result3 = c1.multi(5, 5);
		
		
		System.out.println(result2);
		System.out.println(result1);
		System.out.println(result3);
	}
	//java doesnt suppor multiple inheritance
}
