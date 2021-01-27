package Collection.sort;

import java.util.*;

public class SortDemo implements Comparator<Integer>  ///with comparator
{
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
		
		   Collections.sort(l,new SortDemo());   //call to compare() method
		   
		  
		  System.out.println("After Sorting ="+l);
		  
	  }
  
	 
	   public int compare(Integer t1, Integer t2)
	  {
		  int x= t2.compareTo(t1);
		  return x;
	  }

}
 