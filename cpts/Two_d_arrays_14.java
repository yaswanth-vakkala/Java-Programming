package helloworld;

public class Two_d_arrays_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int b[] = {2,4,6,8};
		int c[] = {5,6,7,8};
		
		int d[][] = {
				{1,2,3,4},
				{2,4,6,8},
				{5,6,7,8}  // it will be unequal columns
		};
		System.out.println(d[0][2]); //for jagged arrs
		for(int i=0;i<3;i++) // i<d.lenght
		{
			for(int j=0;j<4;j++) //j<d[i].lenght
			{
				System.out.print(d[i][j]);
			}
			System.out.println();
		}
	}

}
