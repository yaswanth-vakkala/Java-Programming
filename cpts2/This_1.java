package cls_java;

public class This_1 {
	
	int n;
	This_1(int n){
		this.n = n;
		System.out.println("n= "+n);
	}
	void show() {
		System.out.println("This is show func");
	}
	void print() {
		this.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_1 T = new This_1(10);
		T.print();
	}

}
