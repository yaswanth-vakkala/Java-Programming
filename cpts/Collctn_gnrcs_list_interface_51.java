package helloworld;

import java.util.ArrayList;
import java.util.List;

//collection doesnt support indexing so we cant index values with index and add them between elements.so we use list interface
//list extends collection, so list has all features of collection plus extra ones too.
public class Collctn_gnrcs_list_interface_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List values = new ArrayList();//interface and class
		//cntrl shift o for auto importing
		values.add(4);//Integer v = new Integer(4);
		values.add(45);//all objs
		values.add(12);
		values.add(1,2);
		values.add("hello");
//unlike arr list can have heterogeneouse data types.list is a list of objs.4,45 all theses are wrapper class objs.
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		System.out.println("_________");
		for(Object o : values)
		{
				System.out.println(o);
		}
		
	}

}
