package lab;

public class Lab4_p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do
		{
			if(i%2!=0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}while(i<=15);
	}

}
