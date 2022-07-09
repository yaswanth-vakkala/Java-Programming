package lab;

public class Lab_4_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pn = 28;
		int sum = 0;
		for(int i=1; i<pn; i++) {
			if(pn%i == 0) {
				sum += i;
			}
		}
		if(sum == pn)
		{
			System.out.println("Perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
	}
}
