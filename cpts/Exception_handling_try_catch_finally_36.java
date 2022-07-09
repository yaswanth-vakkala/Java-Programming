package helloworld;

public class Exception_handling_try_catch_finally_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unchecked exception
		try
		{
			int i=9/0;//critical statement as it may give exception
		}
		catch(ArithmeticException e)//catch exception obj and we can be specific like arithmetic about it or just use exception
		{
			System.err.println("error");//can also use out
		}
			//we need to handle the exceptions
		finally
		{
			System.out.println("bye");//it gets executed even if we get exception or not
		}
		System.out.println("good");
	}

}
