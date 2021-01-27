package assignment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentQ11
{
       public static void main(String[] args) {
		
    	   List<mob> list=new ArrayList<>();
    	   
    	   list.add(new mob("kayamat", 876.00));
    	   list.add(new mob("siyan", 876.00));
    	   list.add(new mob("payal", 3457.00));
    	   list.add(new mob("raatein", 345.00));
    	   list.add(new mob("paheli", 9432.00));
    	   list.add(new mob("leela", 100.00));
    	   
    	   System.out.println(list);
    	   
    	      Collections.sort(list, new mob());
    		  System.out.println("Name in accending order");
    		  System.out.println("---------------------------------");
    		  for(int i=0;i<list.size();i++)
    	      {
    	    	  System.out.println(list.get(i));
    	      }
       }
}
