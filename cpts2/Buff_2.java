package cls_java;
import java.io.*;
import java.util.*;

public class Buff_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter 2 single digit nums");
		String s1 = br.readLine();
		String s2 = br.readLine();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(a/b));
		
	}

}
