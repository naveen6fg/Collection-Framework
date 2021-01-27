package assignment.collection;

import java.util.*;

public class StudentsQ16_17 implements Comparable<StudentsQ16_17>,Comparator<StudentsQ16_17>
{
   int id;
   String name;
	public StudentsQ16_17(int id, String name)
	{
		
		this.id = id;
		this.name = name;
	}
	
	StudentsQ16_17()
	{
		
	}
	
	@Override
		public String toString()
	    {
			
			return id+"\t\t"+name;
		}
	
	
	public static void main(String[] args)
	{
	  List<StudentsQ16_17> l=new ArrayList<StudentsQ16_17>();
	  
	  l.add(new StudentsQ16_17(23,"Ankit"));
	  l.add(new StudentsQ16_17(52,"pujji"));
	  l.add(new StudentsQ16_17(27,"punit"));
	  l.add(new StudentsQ16_17(93,"manu"));
	  l.add(new StudentsQ16_17(61,"sanjay"));
	  l.add(new StudentsQ16_17(55,"suman"));
	
	  System.out.println("Sorted  with Id");
	  System.out.println("-------------------------------------");
	  Collections.sort(l);
	  for(Object obj: l)
	  {
		  System.out.println(obj);
	  }
	


	  System.out.println("Sorted with Name");
	  System.out.println("-------------------------------------");
	  Collections.sort(l,new StudentsQ16_17());
	  for(Object obj: l)
	  {
		  System.out.println(obj);
	  }
	  
	}
	  @Override
			public int compareTo(StudentsQ16_17 o)
			{
				
				return this.id-o.id;
			}
	
	

		@Override
		public int compare(StudentsQ16_17 o1, StudentsQ16_17 o2)
		{
			
			return o1.name.compareTo(o2.name);
		}
	
}
