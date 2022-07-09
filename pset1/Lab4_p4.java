package lab;

public class Lab4_p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int i = num;	
		int sum =0;
		int val =0;
		while(i>0)
		{
			val = i%10;
			System.out.println(val);
			i=i/10;
			sum= sum+ (val*val*val);
		}
		System.out.println(sum);
		System.out.println(i);
		if(sum==num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}
	}

}
