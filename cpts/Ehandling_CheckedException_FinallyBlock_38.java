package helloworld;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//BufferReader
//Scanner
//in this case checked exception
public class Ehandling_CheckedException_FinallyBlock_38 {

	public static void main(String[] args) throws Exception {//compiler asks us to write throw exc coz br.readline may throw exception
		// TODO Auto-generated method stub//we can also use try and catch way
		int n = 0;
		System.out.println("enter a num: ");
		BufferedReader br =null;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());//45	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			br.close();//to close the resoureces.all io related stuff are resources so they occupy resoucrecs so close them

		}
		System.out.println(n);
//if try and catch is used, use finally to close the resources
	}
//there are 2 types checked and unchecked exceptions,when compiler knows about it is checked,when it doest prompt about it is unchecked
//only runtime exception subclasses are unchecked remaining all are checked.
}
