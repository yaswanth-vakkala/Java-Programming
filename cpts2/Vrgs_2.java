package cls_java;

public class Vrgs_2 {

	static void print(String...s)
	{
		for(String n:s)
		{
			System.out.print(n+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("hello");
		print("hello","world");
		print("hello","world","java");
	}

}
