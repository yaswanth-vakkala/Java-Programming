package lab;

public class Lab_4_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,50,12};
		int sum = 0;
		int flag=0;
		for(int k : arr) {
			for(int i=1; i<=k; i++)
			{
				if(k%i==0)
					sum++;
			}
			if(sum==2) {
				flag++;
			}
			sum=0;
		}
		System.out.println(flag);
		
		
		
	}

}
