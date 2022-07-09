package lab;
import java.util.*;

public class Lab4_p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int value = 1;
		Scanner S = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter a number to find factorial: ");
			a = S.nextInt();
			for(int i=a; i>0;i--) {
				value = value*i;
			}
			System.out.println("factorial is "+value);
			value=1;
			System.out.println("want to continue(y/n)");
			char ch = S.next().charAt(0);
			if(ch=='n'||ch=='N')
				break;
		}
	}

}
