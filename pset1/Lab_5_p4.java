package lab;

import java.util.Scanner;

public class Lab_5_p4 {
	
	static int factorial(int fnum) {
		int value = 1;
		for(int i=fnum; i>0;i--) {
			value = value*i;
		}
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the num to find factorial: ");
		Scanner S = new Scanner(System.in);
		int fnum = S.nextInt();
		System.out.println(factorial(fnum));
	}

}
