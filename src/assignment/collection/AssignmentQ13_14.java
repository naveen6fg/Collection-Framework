package assignment.collection;

import java.util.*;


public class AssignmentQ13_14 
{
     public static void main(String[] args)
     {
	   List<Integer> l1=new ArrayList<Integer>();	
	   List<Double> l=new ArrayList<Double>();	
	   List<Integer> l2=new LinkedList<Integer>();	
	   
	   l1.add(25);
	   l1.add(53);
	   l1.add(11);
	   l1.add(99);
	   l1.add(22);
	   l1.add(19);
	   l1.add(34);
	   
	   
	   l.add(25.75);
	   l.add(53.00);
	   l.add(11.54);
	   l.add(25.00);
	   l.add(44.3);
	   l.add(19.22);
	   l.add(34.11);

	   
	   l2.add(66);
	   l2.add(24);
	   l2.add(11);
	   l2.add(95);
	   l2.add(93);
	   l2.add(29);
	   l2.add(31);
	   
	   
	   Collections.sort(l1);
	   System.out.println("Using Arraylist-Integer object in sorted list");
	   for (int i = 0; i < l1.size(); i++)
	   {
             System.out.println(l1.get(i));		
	   }
	   
	   
	   Collections.sort(l);
	   System.out.println("Using Arraylist-Double object in sorted list");
	   for (int i = 0; i < l.size(); i++)
	   {
             System.out.println(l.get(i));		
	   }

	   
	   Collections.sort(l2);
	   System.out.println("Using Linkedlist- object in sorted list");
	   for (int i = 0; i < l2.size(); i++)
	   {
		   System.out.println(l2.get(i));		
	   }
   	}
}
