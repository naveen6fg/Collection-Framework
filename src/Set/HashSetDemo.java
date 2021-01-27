package Set;

import java.lang.reflect.Array;
import java.util.*;

public class HashSetDemo
{
      public static void main(String[] args)
      {
	    Set<Integer>  l =new HashSet<Integer>();
	    List<Integer>  s =new ArrayList<Integer>(l);
	    
	    s.add(12);
	    s.add(15);
	    s.add(12);
	    s.add(14);
	    s.add(56);
	    s.add(32);
	    s.add(88);
	    s.add(10);
	    s.add(19);
	    
	    
	    System.out.println("Bofore sorting :"+s);
	    Collections.sort(s);
	    System.out.println("After sorting :"+s);
	 }
}
