package cls_java;

public class This_2 {
	
	int a;
	This_2(){
		System.out.println("empty constructor");
	}
	This_2(int a){
		this();
		this.a = a;
		System.out.println("constructor with "+a);
	}
	void show() {
		System.out.println("This is show");
	}
	void print() {
		this.show();
		System.out.println("This is print");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_2 T = new This_2(10);
		T.print();
	}

}
