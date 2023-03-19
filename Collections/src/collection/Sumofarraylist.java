package collection;

import java.util.ArrayList;

public class Sumofarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//question-sum all integers from the given arraylist of objects.
ArrayList<Object> list = new ArrayList<Object>(); //object or arraylist class
		
		list.add("akshay"); //create a list 
		list.add(12);
		list.add(12);  /// duplicate value also accaepted in a aaraylist
		list.add("10");
		list.add("raut");
		list.add("@");
		list.add(12);
		list.add(" ");  //null value will be aacepted in a list 
		
		int sum = 0;
		for(Object k:list)
		{
			try
			{
				sum =sum+Integer.parseInt(k.toString()); //string to integer conversion
			}
			catch(NumberFormatException e)
			{
			   System.out.println(k.getClass().getSimpleName());
				System.out.println(e);
			}	
		}
		 System.out.println(sum);
	}
}
