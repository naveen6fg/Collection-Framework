package Map;

import java.util.*;
import java.util.Map.Entry;

public class Question
{
       public static void main(String[] args)
       {
    	   Scanner sc =new Scanner(System.in);
    	   
    	   Map<Character,Integer> m = new HashMap<Character,Integer>();   
    		 
    	   System.out.println("Enter a string");
    	   String s =sc.next();
    	   
    	   char[] c =s.toCharArray();
    	 	 
    		  for(int i=0;i<c.length;i++)
    		  {
    			  
    			     if(m.containsKey(c[i]))
    			     {
    		     	   m.put(c[i],(m.get(c[i])+1));
    			     }
    			     else
    			     {
    			    	 m.put(s.charAt(i), 1);
    		     	  }
    		     	 
    		     	  
    		  }
    		  
    		  
    		  Set<Entry<Character, Integer>> entry= m.entrySet(); ///convert into Set
    		   Iterator<Entry<Character, Integer>> itr= entry.iterator();   //creating iterator for set to retrieve objects
    		  
    		     System.out.println("key\tValues");
    		     System.out.println("------------------");
    		     
    		     while (itr.hasNext())
    		     {
    				Entry<Character, Integer> e =  itr.next();
    				System.out.println(e.getKey()+"\t"+e.getValue());
    		     }
    		  
    		  
    		     
	   }
}
