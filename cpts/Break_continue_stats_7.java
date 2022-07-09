package helloworld;

public class Break_continue_stats_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==7)
				continue; //skip remaining code in block and iterate from start
			if(i==9)
				break; // breaks loop
			System.out.println("value is "+i);
		}

	}

}
