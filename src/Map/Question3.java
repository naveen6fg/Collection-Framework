package Map;

import java.util.*;
import java.util.Map.Entry;

public class Question3
{
       public static void main(String[] args)
       {
    	   Scanner sc =new Scanner(System.in);
    	   
    	   Map<String,Integer> m = new LinkedHashMap<String,Integer>();   
    		 
    	   System.out.println("Enter a string");
    	   String s =sc.nextLine();
      	   
    	   String[] c = s.split(" ");
    	   
    	   
    	 	 
    		  for(int i=0;i<c.length;i++)
    		  {
    			  
    			     if(m.containsKey(c[i]))
    			     {
    		     	   m.put(c[i],(m.get(c[i])+1));
    			     }
    			     else
    			     {
    			    	 m.put(c[i], 1);
    		     	  }
    		     	 
    		     	  
    		  }
    		  
    		  //System.out.println(m);
    		  
    		  Set<Entry<String, Integer>> entry= m.entrySet(); ///convert into Set
    		  Iterator<Entry<String, Integer>> itr= entry.iterator();   //creating iterator for set to retrieve objects
    		  
    		    
    		  
    		  
    		  
    		  
    		      System.out.println("key\tValues");
    		     System.out.println("------------------");
    		     while (itr.hasNext())
    		     {
    				Entry<String, Integer> e =  itr.next();
    				
    				System.out.println(e.getKey()+"\t"+e.getValue());

    		     }
       }
}