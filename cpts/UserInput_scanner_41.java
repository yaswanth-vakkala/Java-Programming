package helloworld;

import java.util.Scanner;

//scanner is very advaced.we have bufferreader,system.int.read then why scanner coz it is easy to use
public class UserInput_scanner_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);//getting input from keyboard
		n = sc.nextInt();//method inside scanner to fetch int value
		//advantage- no need to handle exception,no need to convert string into int.
		System.out.println(n);
		//there are many methods in scanner class check it out
		//cntrl click on class name to go to it
		
	}

}
