package cls_java;
import java.util.*;
import java.io.*;

public class Buff_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name = br.readLine();
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter weight: ");
		float wt = Float.parseFloat(br.readLine());
		System.out.println("Enter roll no: ");
		long rn = Long.parseLong(br.readLine());
		System.out.println("Enter your gender: ");
		char gd = (char)br.read();
		System.out.println(name);
		System.out.println(age);
		System.out.println(wt);
		System.out.println(rn);
		System.out.println(gd);
	}

}
