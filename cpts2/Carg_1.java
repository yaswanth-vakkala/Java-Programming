package cls_java;
import java.util.*;

public class Carg_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = args.length;
		int low = -1;
		int slow = -1;
		for(int i=0; i<len ;i++)
		{
			int val = Integer.parseInt(args[i]);
			if(low==-1)
			{
				low = val;
			}
			else if(val < low)
			{
				slow = low;
				low = val;
			}
			else if(val > low)
			{
				if(slow==-1)
				{
					slow = val;
				}
				else if(val < slow)
				{
					slow = val;
				}
			}
		}
		System.out.println("second lowest value is "+slow);
	}

}
