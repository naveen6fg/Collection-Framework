package TreeSet;

import java.util.*;

public class SortingByTreeSet
{
    public static void main(String[] args)
    {
    	SortedSet<Pen> p =new TreeSet<Pen>(new Pen());
    	 
     	  p.add(new Pen("Cello     ", 11));
    	  p.add(new Pen("WritoMetre", 73));
    	  p.add(new Pen("Natraj    ", 11));
    	  p.add(new Pen("Cello      ", 51));
    	  p.add(new Pen("LinkSlyser", 88));
    	  p.add(new Pen("Safari    ", 37));
    	
    	/*p.add(28);
    	p.add(23);
    	p.add(21);
    	p.add(24);
    	p.add(23);
    	p.add(23);
    	p.add(20);
    	p.add(23);*/
    	  
    	  
    	  //System.out.println(p);
    	  
    	  Iterator<Pen> itr= p.iterator();
    	 
    	    while (itr.hasNext())
    	    {
			  //Integer i =  itr.next();
			 System.out.println(itr.next());
		   }
    	    
    	    
    	    
	}
  
}
