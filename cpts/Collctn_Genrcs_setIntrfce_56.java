package helloworld;

import java.util.HashSet;
import java.util.Set;

public class Collctn_Genrcs_setIntrfce_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> values = new HashSet<>();//interface and class
//Hashset hashing algo will return nearest memory element no elements in order
//use TreeSet to get elements in sorted order
		values.add(54);
		values.add(61);
		values.add(95);
		System.out.println(values.add(6));//no duplicates allowed
		
		for(int i:values)
		{
			System.out.println(i);
		}
	}

}
