package helloworld;

public class Ehandle_userDefined_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		i=8;
		j=9;
		try
		{
			int k = i/j;
			if(k==0)
				throw new MyException40("this is not possible");
			System.out.println(k);	
		}
		catch(MyException40 e)//or just exception for default one
		{
			System.out.println("Error "+e.getMessage());
		}
	}

}
