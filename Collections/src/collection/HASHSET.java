package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HASHSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//in hashset order of insertion is random 
		//does no allow duplicate value
		//only one null value allow
		//it is the best choice for remove the duplicate value when order of insertion is random.
		
	
		HashSet<String> hS =new HashSet<String>();
		hS.add("akshay");
		hS.add(null);
		hS.add(null);
		hS.add("raut");
		hS.add("100");
		hS.add("velocity");
		
		
		
		 Iterator<?> it=hS.iterator();
	       while (it.hasNext()) 
	       {
			System.out.println(it.next());
		  }
       System.out.println(hS); //[null, 100, akshay, raut, velocity] only one null value consider
                                //[null, 100, akshay, raut, velocity] order of insrtion is randomly
       
       hS.remove("akshay");  //akshay is remove
       System.out.println(hS);
       
       hS.contains("aksahy"); //akshay object available or not it will be checked
       System.out.println(hS.contains("akshay"));
       
       hS.clear();
       System.out.println(hS); //clear the list
      
       hS.size();
       System.out.println(hS.size()); //size of array find
       
  
      
       
       
		
	}

}
