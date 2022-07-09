package helloworld;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collctn_gnrcs_MapInterface_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//instead of using nums indexing to access elements we can use keys
		Map<String,String> map = new HashMap<>();
//we can also use Hashtable which also implements Map instead of HashMap.
//Hashtable is synchronized (gives more thread safety) whereas HashMap is not synchronized
		//map is a interface
		map.put("myname", "john");
		map.put("actor", "depp");
		map.put("ceo", "katie");
		//if we add same key again it will override it
		
		System.out.println(map);
		//there is no sequence coz of concept of hash code
		//we cant use indexes in maps only keys be used
		Set<String> Keys = map.keySet();
		for(String Key : Keys)
		{
			System.out.println(Key + " "+ map.get(Key));
		}
	}

}
