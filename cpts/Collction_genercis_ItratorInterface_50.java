package helloworld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//collection is collction of elements(objs) and it is an api
public class Collction_genercis_ItratorInterface_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values = new ArrayList();//interface and class
		//cntrl shift o for auto importing
		values.add(4);
		values.add(45);
		values.add(12);
		//check out diff methods in collection api
		System.out.println(values);
		//indexes dont work in collection so we use iterator to iterate
		Iterator it = values.iterator();
		System.out.println(it.next());//it fetches next value but it gives error if elements are out of bound(indx)
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
