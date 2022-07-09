package helloworld;

public class Conditions_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		// if
		if(true)
			System.out.println("hello");
		if(false)
			System.out.println("bye");
		
		if(n==0)
		{	
			System.out.println("nothing");
			System.out.println("bye");// for more than 1 statement mention curly brackets
		}	
		else if(n%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		// curly brackets after each condition is optional
		
		// terenary operators
		// ?: -> condition?expr1:expr2
		int i=5;
		int j=0;
		
		if(i>6)
			j=1;
		else
			j=2;
		
		System.out.println(j);
		j = i>6?1:2;
		System.out.println(j);
		
		//switch operator
		int n1 = 10;
		
		if(n1==1)
			System.out.println("one");
		else if(n1==2)
			System.out.println("two");
		else if(n1==3)
			System.out.println("three");
		//to
		switch(n1) // only some data structures like int,string and char get switched(string only for compiler version 1.7 and above)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break; // to break code from running below blocks
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("no match");
		}
	}

}
