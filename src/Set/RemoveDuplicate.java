package Set;

import java.util.*;
public class RemoveDuplicate
{
     public static void main(String[] args)
     {
	      Integer[] a= { 1,8,2,1,3,4,8,2,7};
	      
	      List<Integer> al= new ArrayList<Integer>(Arrays.asList(a));
	      Set<Integer> s= new HashSet<Integer>(al);
	      
	      
	      System.out.println(s);
	      
	 }
}
