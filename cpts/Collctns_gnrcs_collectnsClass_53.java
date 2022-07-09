package helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//collections class will give sorted output
public class Collctns_gnrcs_collectnsClass_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<Integer>();//generics//angular or diamond brackets
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2);
		
		Collections.sort(values);//sort is static method
		Collections.reverse(values);//reverses the elements
		Collections.shuffle(values);
		//list is mutable
		//check other methods in Collections class
		
		for(Integer o : values)
		{
				System.out.println(o);
		}
	}

}
