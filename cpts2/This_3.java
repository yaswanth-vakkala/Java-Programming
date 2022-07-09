package cls_java;

public class This_3 {

	int a;
	This_3(int a){
		this.a = a;
		System.out.println("In constructor");
	}
	void show(This_3 T1) {
		System.out.println("show funct "+T1.a);
	}
	void print() {
		show(this);
		System.out.println("print func");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_3 T = new This_3(10);
		T.print();
	}

}
