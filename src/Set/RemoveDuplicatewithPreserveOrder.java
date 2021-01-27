package Set;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatewithPreserveOrder
{
    public static void main(String[] args)
    {
    	Integer[] a= { 1,8,2,1,3,4,8,2,7};
	      
	      List<Integer> al1= new ArrayList<Integer>(Arrays.asList(a));
	      
	      List<Integer> al2= new ArrayList<Integer>();
	      
	      for(Integer i: al1)     //with for Each loop
	      {
	    	  if(!al2.contains(i))
	    	  {
	    		  al2.add(i);
	    	  }
	      }
	      
	     for(int i=0;i<al1.size();i++)     //without for each loop 
	      {
	    	  if(!al2.contains(al1.get(i)))
	    	  {
	    		  al2.add(al1.get(i));
	    	  }
	    	  
	      }
	      
	      System.out.println(al2);
	      System.out.println();
	      for(int i=0;i<al2.size();i++)
	      {
	    	  System.out.print(al2.get(i)+" ");
	      }
	      
	      
	      List<Integer> al3 =al1.stream().distinct().collect(Collectors.toList());
	      
	      System.out.println("\n"+al3);
	      
	      Collections.reverse(al3);
	      System.out.println();
	      System.out.println(al3);
	      
	}
}
