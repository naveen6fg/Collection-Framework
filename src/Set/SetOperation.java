package Set;

import java.util.*;

public class SetOperation {


      public static void main(String[] args)
      {
	    //Set<Integer>  s=new HashSet<Integer>();   //insertion order are not preserve and duplicate not allowed
	   // Set<Integer>  s=new LinkedHashSet<Integer>();  //insertion order are preserve and duplicate not allowed
	     Set<Integer>  s=new TreeSet<Integer>();  //gives object in sorted list(ASC) and duplicate not allowed
	
	    
	    s.add(12);
	    s.add(15);
	    s.add(12);  //duplicate object
	    s.add(14);
	    s.add(16);
	    s.add(32);
	    s.add(88);
	    s.add(10);
	    s.add(19);
	    
	    
	
	    
	    Iterator<Integer> itr  = s.iterator();
	   
	    while(itr.hasNext())
	    {
	    	//Integer i = (Integer)itr.next();
	    	System.out.println(itr.next());
	    }
	 }
}
