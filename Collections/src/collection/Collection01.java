package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection01 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> list = new ArrayList<Object>(); //object or arraylist class
		
		list.add("akshay"); //create a list 
		list.add(12);
		list.add(12);  /// duplicate value also accaepted in a aaraylist
		list.add("10");
		list.add("raut");
		list.add("@");
		list.add(12.20);
		list.add(" ");  //null value will be aacepted in a list 
		list.add(" ");
	
	
		System.out.println(list);
		list.add(1, "i am"); // replace index one value 12 to i am.
		System.out.println(list);
		
		list.get(0);
		System.out.println(list.get(0));
		
		Collections.reverse(list); // this is a collection class method
		System.out.println(list);
		
		list.add(1, "i am"); // replace index one value 12 to i am.
		System.out.println(list);
		
		list.clear();  // clear the list using this method
		System.out.println(list); 
		
		
		
ArrayList<String> list1 = new ArrayList<String>(); //object or arraylist class
		
		list1.add("akshay"); //create a list 
		list1.add("raut");
		list1.add("name");  /// duplicate value also accaepted in a aaraylist
		list1.add("bodake");
		list1.add("this");
		list1.add("same");
		list1.add("for");
		list1.add("100");  //null value will be aacepted in a list
		
		Collections.sort(list1); // sorting the string in assending 
		System.out.println(list1);
		
		Collections.reverse(list1);
		System.out.println(list1);
		
	}
}
