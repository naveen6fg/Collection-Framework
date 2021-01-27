package Collection.sort;

import java.util.*;

public class SortDemo1     //without comparator 
{                           //with compareble
  public static void main(String[] args)
  {
      sortIntegerObject();	
  }
  
	  static void sortIntegerObject()
	  {
		  List<Integer> l = new ArrayList<Integer>();
		  
		  l.add(122);
		  l.add(133);
		  l.add(100);
		  l.add(176);
		  l.add(19);
		  l.add(12);
		  l.add(522);
		  l.add(022);
		  
		  System.out.println("Before Sorting ="+l);
		
		   Collections.sort(l);     //internally calls to compareTo() method
		  
		  System.out.println("After Sorting ="+l);
		  
	  }
  
	 


}