package assignment.collection;

import java.util.*;

public class AssignmentQ7 implements Comparator<Integer>
{
	AssignmentQ7()
	{
		
	}
	
	
	
	
   public static void main(String[] args)
   {
	  Set<Integer> s =new TreeSet<>();
	  s.add(26);
	  s.add(16);
	  s.add(66);
	  s.add(62);
	  s.add(54);
	  s.add(23);
	  s.add(76);
	  s.add(69);
	  s.add(19);
	  
	  
	 // System.out.println(s); //Ascending order
	  List<Integer> l=new ArrayList<Integer>(s);
	  //System.out.println(l);
	  Collections.sort(l, new AssignmentQ7());
	  System.out.println(l);
	  
   }

@Override
public int compare(Integer o1, Integer o2)
{
	
	return o2.compareTo(o1);
}
}
