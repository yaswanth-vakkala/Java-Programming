package cls_java;

public class Constr_1 {
	int x;
	Constr_1(){
		x = 10;
		System.out.println("Inside constructor and x is "+x);
	}
	Constr_1(int a){
		x = a;
		System.out.println("num entered is "+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constr_1 T1 = new Constr_1();
		Constr_1 T2 = new Constr_1(7);
		Constr_1 T3 = new Constr_1(21);
		System.out.println(T3.x);
		T3 = new Constr_1();
	}

}
