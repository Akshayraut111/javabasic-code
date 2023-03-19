package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Object> list=new LinkedList<Object>();
		list.add("akshay"); //create a list 
		list.add(12);
		list.add(12);  /// duplicate value also accaepted in a aaraylist
		list.add("10");
		list.add("raut");
		list.add("@");
	    list.add(12);
		list.add(" ");
		list.add(" ");

		System.out.println(list);
		list.add(1, 200);
		System.out.println(list);
		
		ArrayList<Object> list1 =new ArrayList<Object>();
		list1.add("akshay"); //create a list 
		list1.add(12);
		list1.add("10");
		list1.add("raut");
		list1.add("@");
		list1.add(12);
		list1.add(" ");
		list1.add(" ");
		 System.out.println(list1);
		 list1.add(1,300);
		 System.out.println(list1);
	}

}
