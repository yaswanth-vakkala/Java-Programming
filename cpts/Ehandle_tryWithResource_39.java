package helloworld;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//BufferReader
//Scanner
//in this case checked exception
public class Ehandle_tryWithResource_39 {

	public static void main(String[] args) throws Exception {//compiler asks us to write throw exc coz br.readline may throw exception
		// TODO Auto-generated method stub//we can also use try and catch way
		int n = 0;
		System.out.println("enter a num: ");
//with this syntax try block can be written without finally or catch and it is called as try with resource
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)//in 1.7v java it isnt compulsory to write finally block instead define the obj in try line itself
		{//as soon as obj goes out of scope resource will be closed immediately
			n = Integer.parseInt(br.readLine());//45	
		}
//		finally//only this block coz our intention here is not to handle exception but to close resouces
//		{
//			br.close();//to close the resoureces.all io related stuff are resources so they occupy resoucrecs so close them
//			System.out.println("closed");
//		}
		System.out.println(n);
//if try and catch is used, use finally to close the resources
	}
//there are 2 types checked and unchecked exceptions,when compiler knows about it is checked,when it doest prompt about it is unchecked
//only runtime exception subclasses are unchecked remaining all are checked.
}
