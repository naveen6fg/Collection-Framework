package assignment.collection;

import java.util.*;
import java.util.Map.Entry;

public class CitizenObject
{
    public static void main(String[] args)
    {
    	    Scanner sc= new Scanner(System.in);
	     	Map<Integer, Citizen> m =new HashMap<Integer, Citizen>();
	     	
	     	System.out.println("How many citize do u want to add?");
	     	int num=sc.nextInt();
	     	
	     	for(int i=1;i<=num;i++)
	     	{
	     		sc.nextLine();
	     		
	     		System.out.print("Enter " +i+ " citizen Voter Id =");
	     		int id=sc.nextInt();
	     		System.out.print("Name of citizen =");
	     		
	     		sc.nextLine();
	     		
	     		String name=sc.nextLine();
	     		System.out.print("Age of citizen =");
	     		int age=sc.nextInt();
	     		
	     		System.out.println();
	     		m.put(id, new Citizen(name, age));
	     		
	     	}
	     	
	     	//System.out.println(m);
	     	
	                Set<Entry<Integer, Citizen>> s=	m.entrySet();
	     	        Iterator<Entry<Integer, Citizen>> ite =  s.iterator();
	     	        
	     	        
	     	        System.out.println("Voter Id\tName\t\tAge");
	     	        System.out.println("----------------------------------------------");
	     	        while (ite.hasNext())
	     	        {
						Entry<Integer,Citizen> e = ite.next();
						System.out.println(e.getKey()+"\t\t"+e.getValue());
						
					}
	     	        
	     	        
	     	        
	     	       ite=s.iterator();
	     	       System.out.println();
	     	       System.out.println("Age b/w 25 to 35");
	     	      System.out.println("----------------------------------------------");
	     	       System.out.println("Voter Id\tName\t\tAge");
	     	        System.out.println("----------------------------------------------");
	     	        while (ite.hasNext())
	     	        {
						Entry<Integer,Citizen> e = ite.next();
						if(e.getValue().getAge()>=25&& e.getValue().getAge()<=35)
						System.out.println(e.getKey()+"\t\t"+e.getValue());
						
					}
	     	      
	     	      
	     	        ite=s.iterator();
	     	       System.out.println();
	     	      System.out.println("Voter name start with A");
	     	     System.out.println("----------------------------------------------");
	     	       System.out.println("Voter Id\tName\t\tAge");
	     	        System.out.println("----------------------------------------------");
	     	        while (ite.hasNext())
	     	        {
						Entry<Integer,Citizen> e = ite.next();
						if(e.getValue().getName().startsWith("A"))
						System.out.println(e.getKey()+"\t\t"+e.getValue());
						
					}
	}
}
