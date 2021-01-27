package assignment.collection;

import java.util.*;

public class AssignmentQ9 implements Comparator<Double>
{
	AssignmentQ9()
	{
		
	}
	
   public static void main(String[] args)
   {
	  Set<Double> s =new TreeSet<>();
	  s.add(88.9);
	  s.add(23.0);
	  s.add(76.55);
	  s.add(99.12);
	  s.add(11.23);
	  s.add(10.0);
	  s.add(55.0);
	  s.add(97.22);
	  s.add(82.00);
	  
	  
	 
	  List<Double> l=new ArrayList<Double>(s);
	 
	  Collections.sort(l, new AssignmentQ9());
	  
	  System.out.println(l);
	  
    }

	@Override
	public int compare(Double o1, Double o2)
	{
		
		return o2.compareTo(o1);
	}
}
