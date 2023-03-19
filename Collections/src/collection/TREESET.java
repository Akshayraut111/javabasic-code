package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TREESET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DOSE NOT ALLOW DUPLICATE VALUE
		//ORDER OF INSERTION IS ASCENDING ORDER
		//IT DOES NOT ALLOW THE NULL VALUE
		//IT IS EASY TO REMOVE DUPICATE VALUE WHEN ORDER OF INSERTION IS ASCENDING ORDER
		
		TreeSet<String> ts =new TreeSet<String>();
		
		
		ts.add("akshay");
		ts.add("100");
		ts.add("raut");
		ts.add("mumbai");
		ts.add("akshay");
		
			
		try {
			ts.add(null);  //handle runtime exception
			System.out.println(ts);
			
		    } 
		catch (NullPointerException e) 
		   {
			System.out.println("in treeset does not allow null value");
		   }
		finally
		     {
			System.out.println(ts);
		      }
	
		Iterator<String> lItr = ts.iterator();
		while (lItr.hasNext()) 
		{
			System.out.println(lItr.next());
		}
		System.out.println("-----------------------------------------------------");
		
		
		
	}

}
