package assignment.collection;

import java.util.*;

public class AssignmentQ8 implements Comparator<String>
{
	AssignmentQ8()
	{
		
	}
	
	
	
	
   public static void main(String[] args)
   {
	  Set<String> s =new TreeSet<>();
	  s.add("Sanjay");
	  s.add("Ranjann");
	  s.add("Ankit");
	  s.add("Eglasis");
	  s.add("Wail");
	  s.add("Banty");
	  s.add("Raju");
	  s.add("Zebra");
	  s.add("Damn");
	  
	  
	 // System.out.println(s); //Ascending order
	  List<String> l=new ArrayList<String>(s);
	  //System.out.println(l);
	  Collections.sort(l, new AssignmentQ8());
	  System.out.println(l);
	  
   }

@Override
public int compare(String o1, String o2)
{
	
	return o2.compareTo(o1);
}
}
