package lab;

public class Lab3_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a= 5;
	    int b= ++a + ++a + a++ + ++a;
	    System.out.println(b);

	    a = 5;
	    b = ++a - a++ + a++ - ++a;
	    System.out.println(b);
	    
	    a = 10;
	    b = a++ * ++a / ++a * a++;
	    System.out.println(b);
	}

}
