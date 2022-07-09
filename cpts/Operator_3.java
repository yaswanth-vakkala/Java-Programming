package helloworld;

public class Operator_3 {

	public static void main(String[] args) {
		// arithmetic - +,-,*,/,%
		int m=6,n=4;
		int r1 = m+n;
		int r2 = m-n;
		int r3 = m*n;
		int r4 = m/n; //(gives only quotient part)(default int)
		double r5 = (double)m/n;
		int r6 = m%n;//(reminder)
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
		
		int x = 4;
		int y = 5;
		y = y+x; // or n += m; shorthand operators
//		n++;(n+=1) increment operator
//		n--;(n-=1) decrement operator
//		++n; pre increment first increments and assign to variable
//		n++; post increment first assigns and increment(but assigned variable will have old value)
		System.out.println(y);
		x = x++;
		System.out.println(x);
		x = ++x;
		System.out.println(x);
		

	}

}
