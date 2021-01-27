package Set;

import java.util.*;

public class IteratorCases
{
     public static void main(String[] args)
     {
		Set s =new HashSet();
		
		s.add(54);
		s.add(12);
		s.add(54);
		s.add(67);
		s.add(6);
		s.add(721);
		s.add(28);
	
		System.out.println(s);
		System.out.println();
		
		
		Iterator itr= s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		itr= s.iterator();    //reAssign
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
     }
}
