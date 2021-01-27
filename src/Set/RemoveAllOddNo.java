
package Set;
import java.util.*;

public class RemoveAllOddNo
{
      public static void main(String[] args)
      {
	    Set<Integer>  s=new HashSet<Integer>();
	   // List<Integer>  s =new ArrayList<Integer>(l);
	    
	    s.add(12);
	    s.add(15);
	    s.add(12);
	    s.add(14);
	    s.add(16);
	    s.add(32);
	    s.add(88);
	    s.add(10);
	    s.add(19);
	    
	    
	   // System.out.println("Bofore sorting :"+s);
	    //Collections.sort(s);
	    //System.out.println("After sorting :"+s);
	    
	    Iterator itr  = s.iterator();
	   
	    while(itr.hasNext())
	    {
	    	Integer i = (Integer) itr.next();
	    	if(i%2!=0)
	    	{
	    		itr.remove();
	    	}
	    }
	    System.out.println(s);
	 }
}
