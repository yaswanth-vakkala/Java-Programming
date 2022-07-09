package lab;

import java.util.Scanner;

public class Lab_5_p6 {

	static int factorial(int fnum) {
		int value = 1;
		for(int i=fnum; i>0;i--) {
			value = value*i;
		}
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("Enter the number: ");
		Scanner S = new Scanner(System.in);
		int fnum = S.nextInt();
		int[] arr = new int[10];
		while (fnum > 0) {
		    arr[i] = (fnum % 10);
		    fnum = fnum / 10;
		    i+=1;
		}
		System.out.println(arr[2]);
		
	}

}
