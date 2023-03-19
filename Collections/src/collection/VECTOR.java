package collection;

import java.util.ListIterator;
import java.util.Vector;

public class VECTOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Vector<Object> vlist = new Vector<Object>();
		vlist.add(10);
		vlist.add(30);
		vlist.add(0, 100);
		vlist.add(50);

		ListIterator<Object> lItr = vlist.listIterator();
		
		while (lItr.hasNext()) //has next is printing next eleement
		{
		   System.out.println(lItr.next());
		}
		System.out.println("---------------------------------------------------------------------------");
		while (lItr.hasPrevious()) 
		{
		
	     System.out.println(lItr.previous());
		}
	}

}
