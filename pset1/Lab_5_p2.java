package lab;

public class Lab_5_p2 {

	public static void main(String[] args) {
		int arr[] = {5,7,19,23,29,12};
		int sum = 0;
		int flag=0;
		int i=0;
		while(i<arr.length) {
			int j=1;
			while(j<=arr[i]) {
				if(arr[i]%j==0)
					sum++;
				j++;
			}
			if(sum==2)
				flag++;
			sum=0;
			i++;
		}
		System.out.println(flag);

	}

}
