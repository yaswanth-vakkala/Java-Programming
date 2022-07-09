package lab;

public class Lab_6_case5 {
	
	static class A{
		B ob1;
		A(B ob1){
			this.ob1 = ob1;
		}
		void show() {
			System.out.println("a= "+ob1.a);
		}
	}
	static class B{
		int a;
		B(int a)
		{
			this.a = a;
			A oa = new A(this);
			oa.show();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lab_6_case5 obj = new Lab_6_case5();
		B obj1 = new B(19);
		
	}

}
