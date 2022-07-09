package cls_java;

public class Operator_relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean r=(2<5);
		boolean l=(2==5);
		System.out.println(r);
		System.out.println(l);
//		boolean k = (2=5); error
		boolean k = (2!=5);
		System.out.println(k);
		boolean m = (2<5 && 4>6);// based on or and and truth tables
		System.out.println(m);
		m = (2<5 || 4>6);
		System.out.println(m);
		m = !(!(2<5));
		System.out.println(m);
		
		
	}

}
