package collection;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//order of insertion in this sequential
		// does not allow duplicate value
		//only one null value will accaepted
		//it is easy to remove duplicate value when order of insertion in sequential.
	
   LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        set.add(null);
        set.add(null);
        
        System.out.println(set);
	}

}
