package assignment.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AssinmentQ2
{
   public static void main(String[] args)
   {
	  List l=new LinkedList();
	  l.add('A');
	  l.add(19.9);
	  l.add(18);
	  l.add("String");
	  l.add(12);
	  l.add(true);
	  l.add(13);
	  l.add(null);
	  l.add(60);
	  
	  
	  
	  //System.out.println(l);
	  Iterator itr= l.iterator();
	  dispIntegerObject(l);
	  System.out.println();
	  dispEvenIntegerObject(l,itr);
	  System.out.println();
	  itr= l.iterator();
	  dispStringObject(l,itr);
	  System.out.println();
	  itr= l.iterator();
	  AddAndRemoveStringObjectFromStartAndEnd(l,itr);
	  
	
   }
   
   static void dispIntegerObject(List l)
   {
	   for(int i=0;i<l.size();i++)
	   {
		   Object obj= l.get(i);
		   if(obj instanceof Integer)
		   System.out.println(obj);
	   }
   }
   static void dispEvenIntegerObject(List l,Iterator itr)
   {
	   while (itr.hasNext())
	   {
		 Object obj =itr.next();
		

		   if(obj instanceof Integer)
		   {
			   Integer i =(Integer)obj;
			   if(i%2==0)
			   {
				   System.out.println(i);
			   }
		   }
			   
			  
	   }
   }
   
    static void dispStringObject(List l,Iterator itr)
    {
    	
    	 while (itr.hasNext())
  	    {
    		 
  		 Object obj =itr.next();
 
  		   if(obj instanceof String)
  		   {
  		
  			   String s=(String)obj;
  			   /*if(s.charAt(0)=='S')  /*/if(s.startsWith("S"))
  			   {
  				   System.out.println(s);
  			   }
  		   }
      }
  }
    
    static void AddAndRemoveStringObjectFromStartAndEnd(List l,Iterator itr)
    {
    	l.add(0,"Naveen");
    	l.add(l.size(),"Kumar");
    	System.out.println(l);
    	l.remove(0);
    	l.remove(l.size()-1);
    	System.out.println(l);
    	
    	
    	List l1 =new LinkedList(l);
    	 LinkedList l2 =(LinkedList)l1;//downcaste  
    	LinkedList l4=new LinkedList(l); //direct
    	
    	l2.addFirst("Naveen");
    	l2.addLast("Ppy");
    	System.out.println(l2);
    	
    	l2.removeFirst();
    	l2.removeLast();
    	System.out.println(l2);
    	
    	
    	
    }
}

