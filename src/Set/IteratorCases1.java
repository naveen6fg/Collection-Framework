package Set;

import java.util.*;

public class IteratorCases1
{
     public static void main(String[] args)
     {
		Set l =new HashSet();
		List s =new ArrayList(l);
		
		s.add(54);
		s.add(12);
		s.add(54);
		s.add(67);
		s.add(6);
		s.add(721);
		s.add(28);
		s.add(28);
	
		//System.out.println(s);
		//System.out.println();
		
		
		Iterator itr= s.iterator();
		
		/*while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(s); // removed all elements*/
		
	
		
		/*while(itr.hasNext())
		{
			
			itr.remove();   //Excepetion         //remove() has to be used after next() only
		}
		System.out.println(s);*/     
		
		
		
		
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(itr.next());
		
		}
		
		
		
     }
}