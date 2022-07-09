package cls_java;

public class This_4 {
	int a;
	class Two{
		Two(This_4 T){
			System.out.println(T.a);
		}
	}
	
	This_4(int a){
		this.a = a;
		Two Tw = new Two(this);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_4 T1 = new This_4(10);
	}

}
