package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Hashmap1 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> map=new HashMap<String,String>();
		 map.put("1", "AKSHAY");
		 map.put("city1", "mumbai");
	     map.put("1", "AKSHAY");
		 map.put(" ", " ");
	     map.put(" ", " ");
		 
       Set<?> mapset1=map.entrySet();
		 
		 Iterator<?> its=mapset1.iterator();
		 
		 while (its.hasNext()) 
		 {
			System.out.println(its.next());
		}
		 System.out.println(map);
		 
		 
		 Hashtable<String, String> map1=new Hashtable<String,String>();
		 map1.put("1", "akshay");
		 map1.put("city1", "mumbai");
		 map1.put(" ", " ");
		 map1.put(" ", " ");
		 map1.put("10" ,"akshay" );
		 Set<?> mapset=map1.entrySet();
		 
		 Iterator<?> itl=mapset.iterator();
		 
		 while (itl.hasNext()) 
		 {
			System.out.println(itl.next());
		}
		 
    }
  }

       