package lab;
import java.util.Scanner;

public class Lab_5_p6b {

	static boolean isStrong() {
		Scanner S = new Scanner(System.in);
		System.out.print("Enter a number : ");				
		int snum = S.nextInt();
		int n = snum;
		int fact,sum = 0;
		while(n != 0)
		{	
			fact = 1;
			int r = n % 10;
			for(int i = r ; i >= 1 ; i--)
			fact = fact * i;
			sum = sum + fact;
			n=n/10;
		}
		if(sum == snum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isStrong());
	}

}
