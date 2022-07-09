package lab;

public class Lab_3_p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 15;
	    int b= --a + a-- + a--;
	    System.out.println("b= "+b);
	    System.out.println("a= "+a);

	    a = 15;
	    b = --a - --a + a-- - a--;
	    System.out.println("b= "+b);
	    System.out.println("a= "+a);
	    
	    a = 20;
	    b = --a * a-- / --a * --a;
	    System.out.println("b= "+b);
	    System.out.println("a= "+a);

	}

}
