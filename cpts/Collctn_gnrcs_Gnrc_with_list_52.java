package helloworld;

import java.util.ArrayList;
import java.util.List;

public class Collctn_gnrcs_Gnrc_with_list_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<Integer>();//generics//angular or diamond brackets
		values.add(4);
		values.add(6);
		values.add(9);
//		values.add("2");
		
		for(Integer o : values)
		{
				System.out.println(o);
		}
	}

}
