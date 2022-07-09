package helloworld;

public class Exception_handling_multiplecatchblocks_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unchecked exception
		try
		{
//			int i=9/0;//critical statement as it may give exception
//			int a[] = new int[6];
			int a[] = null;
			a[4] = 8;
			a[6] = 9;
		}
		catch(ArithmeticException e)//catch exception obj and we can be specific like arithmetic about it or just use exception
		{
			System.err.println("cant divide by zero");//can also use out
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("stay in array limit");
		}
		catch(Exception e)//can handle any exception and must be at last or get error
		{
			System.out.println("went wrong");
		}
//we can also write multiple exceptions in 1 catch
//catch(ArithmeticException|ArrayIndexOutOfBoundsException e)//pipe operator
//this concept introduced in 1.7 version
		finally
		{
			System.out.println("bye");//it gets executed even if we get exception or not
		}
	}

}
