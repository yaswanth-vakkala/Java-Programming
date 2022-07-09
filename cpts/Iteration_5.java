package helloworld;

public class Iteration_5 {
	public static void main(String[] args)
	{
		//while loop
		int i = 1;
		while(i<=5) //structure - intial value, condition, increment or decrement
		{										// end point not known		
			System.out.println("hello");
			i++;
		}
		//do while loop
		i = 1;
		do
		{
			System.out.println("hello1");
			i++;
		}while(i<=5);
		//for loop
		for(int j=1;j<=5;j++) //we know start and end point
		{
			System.out.println("printed");
		}
		//for-each loop (we talk about it after array concept)
	}
}
