package helloworld;

public class Enhanced_for_loop_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//foreach or enhaced for loop
		int a[] = {1,2,3,4};
		
		for(int k : a)
		{
			System.out.println(k);
		}
		//for 2d array
		int d[][] = {
				{1,2,3,4},
				{2,4,6,8},
				{5,6,7,8}  // it will be unequal columns
		};
		
		for(int k[] : d)
		{
			for(int l : k)
			{
				System.out.print(" "+ l);
			}
			System.out.println();
		}
	}

}
