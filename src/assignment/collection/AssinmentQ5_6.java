package assignment.collection;

import java.util.*;

import College.Student;

public class AssinmentQ5_6
{
    public static void main(String[] args)
    {
	   
	   /*Set s2 =new LinkedHashSet<>();  */Set s2 =new HashSet<>();
	   List s =new ArrayList<>(s2);
	   
	   s.add(new Student4("Sagar",56));
	   s.add(new Mobile2("Xiomi",14000));
	   s.add(new Student4("Pappu",56));
	   s.add(new Mobile2("OnePlus",18973));
	   s.add(new Student4("Dinkar",33));
	   s.add(new Student4("Sanay",98));
	   s.add(new Mobile2("Mi",10000));
	   s.add(new Student4("raju",56));
	   s.add(new Student4("Sagar",45));
	   s.add(new Mobile2("Nokia",80000));
	   
	   
	   
	  
	   
	   
	   dipStudentObject(s);
	   removeStudLessThan60Marks(s);
	   /*for(Object Object :s)
	   {
		   if(Object instanceof Student4)
		   System.out.println(Object);
	   }*/
	    MobilePriceBwSomeNo(s);
    }
    
    static void dipStudentObject(List l)
    {
    	System.out.println("-------Student Object----------");
    	for (int i = 0; i < l.size(); i++)
 	   {
	 	    Object object= l.get(i);
	 	    if (object instanceof Student4)
	 	    {
	 	    	System.out.println(object);	
			}
	 	   
	 	    
 	    
     	}	
    	System.out.println();
    	System.out.println("-----------Moble objects------------");
    	for (int i = 0; i < l.size(); i++)
    	{
    		Object object= l.get(i);
    		
    		
    		if (object instanceof Mobile2)
    		{
    			System.out.println(object);	
    		}
    		
    	}	
    }
    
       static void removeStudLessThan60Marks(List l)
       {
    	   
    	   System.out.println();
       	    System.out.println("-----------Student above 60-----------");
    	   for (int i = 0; i < l.size(); i++)
       	   {
	       		Object object= l.get(i);
	       		if (object instanceof Student4)
	       		{
	       			
	       		 Student4 s=(Student4)object;
	       			
	       		   if(s.getGrade()>60)
	       			{
	       			  l.remove(s);
	       			 System.out.println(s);
	       			}
       		    }
          }
       }

    	   static void MobilePriceBwSomeNo(List l)
    	   {
    		   
    		   System.out.println();
    		   System.out.println("-----------Mob price b/w 15000 to 25000------------");
    		   for (int i = 0; i < l.size(); i++)
    		   {
    			   Object object= l.get(i);
    			   if (object instanceof Mobile2)
    			   {
    				   
    				   Mobile2 m=(Mobile2)object;
    				   
    				   if(m.getPrice()>15000 && m.getPrice()<25000)
    				   {
    					   
    					   System.out.println(m);
    				   }
    			   }
    		   }
    	   
    
     }
}