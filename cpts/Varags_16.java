package helloworld;

class Calculator
{
	public int add(int ... n) //params in array form
	{
		int sum=0;
		for(int i: n)
		{
			sum = sum + i;
		}
		return sum;
	}
}

public class Varags_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable arguments or variabe lenght args
		Calculator obj = new Calculator();
		System.out.println(obj.add(4,5,5,10));
		
	}

}
