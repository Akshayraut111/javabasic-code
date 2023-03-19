package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Object, Object> map=new HashMap<Object, Object>();
		
		map.put(1, "akshay");
		map.put(" ", "raut");  //only one null key and no of null value store 
		map.put(" ", "null value");
		map.put("city1", "mumbai");
		map.put(5, "goa");
		map.put(3, "satara");
		map.put(1, "akshay");
		
		System.out.println(map);
		
          Set<?> mapSet=map. entrySet();
         Iterator<?> it = mapSet.iterator();
         
         while (it.hasNext()) 
         {
			System.out.println(it.next());
		}
        
       }
	}


