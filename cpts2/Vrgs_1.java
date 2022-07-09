package cls_java;

public class Vrgs_1 {
	
	static void show(int...n)
	{
		for(int i:n)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(10);
		show(2,4);
		show(1,5,10);
	}

}
