package cls_java;
import java.io.*;

public class Buff_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter 2 single digit nums");
		int a = br.read()-48;
		int b = br.read()-48;
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(a/b));
		
	}

}
