package helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collctns_gnrscs_ComparatorInterface_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<Integer>();//generics//angular or diamond brackets
		values.add(404);
		values.add(639);
		values.add(908);
		values.add(265);
		
		//comparator operator to change sort logic
		Comparator<Integer> c = new Comparator<Integer>()
				{
					public int compare(Integer i, Integer j)
					{
						if(i%10>j%10)//%10 gives last digit value
							return 1;//1 means sort -1 means dont sort
						else
							return -1;
						//or return i%10>j%10?1:-1;
//comparator is functional interface so lambdha exp can be used. Comparator<Integer> c = (i,j) -> i%10>j%10?1:-1; we can directly write this code in sort.						
					}
				};
//we can also do this for string,our own objs.
//since comparator is interface we an create a new class or write an anonymous class
		
//we are sorting elements from first digit itself but i want to sort based on last digit only.so we are modifying sort method so we need to know how it works.
		Collections.sort(values,c);//sort is static method
//comparable interface defines logic for sorting integers.
		for(Integer o : values)
		{
				System.out.println(o);
		}
	}

}
