package cls_java;

public class This_5 {
	
	int a;
	This_5(int a){
		this.a = a;
	}
	This_5 show() {
		a++;
		return this;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_5 T1 = new This_5(10);
		This_5 T2 = T1.show();
		System.out.println("IN T2.a="+T2.a);
	}

}
