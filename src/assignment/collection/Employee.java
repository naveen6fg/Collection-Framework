package assignment.collection;


import java.util.*;
import java.util.Map.Entry;

public class Employee
{
	static Scanner sc=new Scanner(System.in);
     public static void main(String[] args)
     {
    	
	     Map<Integer,String>	m=new HashMap<Integer,String>();
	
	     System.out.println("How many Entries do u want to Add?");
	     int num =sc.nextInt();
	     
	     System.out.println("Id NAME");
	     for(int i =0;i<num;i++)
	     {
	    	m.put(sc.nextInt(), sc.nextLine()); 
	     }
	     
	    /* m.put(14, "Ram");
	     m.put(17, "Yaghpal");
	     m.put(13, "Naveen");
	     m.put(12, "Rayan");
	     m.put(16, "Dipesh");
	     m.put(11, "Imtiyaz");
	     m.put(18, "Shubham");*/
	     
	    // System.out.println(m);
	   
	     Set<Entry<Integer, String>> s= m.entrySet();
		 Iterator<Entry<Integer, String>> itr = s.iterator();
	     
	   //toCheckId(m);
	     Display(m,itr);
	     //toRemoveEntry(m);
	     DispEmpName(m);
	    
     }
     static void Display(Map<Integer,String> m,Iterator<Entry<Integer, String>> itr)
     {
	   
	    
	    
	    System.out.println("ID\tNAME");
	    System.out.println("------------------------");
	    
	    while(itr.hasNext())
	    {
	    	Entry<Integer,String> e = itr.next();
	    	System.out.println(e.getKey()+"\t"+e.getValue());
	    }
        
     }  
	      
      
	    
	    
	    static void toCheckId(Map<Integer,String>	m)
	    {
	    	    
		    System.out.println("Enter the Id to chect whether it exist or not");
		    int num2=sc.nextInt();
		    if(m.containsKey(num2))
		    {
		    	System.out.println("Found");
		    	//System.out.println(m.getKey()+"\t"+m.getVa);
		    }
		    else
		    {
		       System.out.println("Not found");	
		    }
	    }
	    
	    static void toRemoveEntry(Map<Integer,String> m,Iterator<Entry<Integer, String>> itr)
	    {
	    	System.out.println("Enter the key to Remove Entire entry");
		    int num2=sc.nextInt();
		    if(m.containsKey(num2))
		    {
		    	m.remove(num2);
		    	System.out.println("Removed");
		    }
		   Display(m ,itr);
		    
	    }
	    
	    static void DispEmpName(Map<Integer,String> m)
	    {
	    	  System.out.println("NAME");
		    System.out.println("------------------------");
		    
		   System.out.println(m.values());
	    }	
	        
	 }

