package assignment.collection;

import java.util.*;

public class AssinmentQ10 implements Comparator<AssinmentQ10>
{
	int id;
	String name;
	double marks;
	
	public AssinmentQ10(int id, String name, double marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public AssinmentQ10()
	{
		
	}
	 public String toString()
	   {
		   return id+"          "+name+"          "+marks;
	   }
	
   
	
   public static void main(String[] args)
   {
	  List<AssinmentQ10> s =new ArrayList<AssinmentQ10>();
	  s.add(new AssinmentQ10(86, "Sajana ", 56.9));
	  s.add(new AssinmentQ10(67, "Neha   ", 98.9));
	  s.add(new AssinmentQ10(96, "Priya  ", 89.9));
	  s.add(new AssinmentQ10(74, "Trisha ", 99.9));
	  s.add(new AssinmentQ10(90, "Amrita ", 77.0));
	  s.add(new AssinmentQ10(43, "Poojita",23.9));
	  s.add(new AssinmentQ10(23, "Pujita ", 89.9));
	  s.add(new AssinmentQ10(91, "Lovely ", 29.9));
	  
	  
	  Collections.sort(s, new AssinmentQ10());
	  System.out.println("Name in accending order");
	  System.out.println("---------------------------------");
	  for(int i=0;i<s.size();i++)
      {
    	  System.out.println(s.get(i));
      }
	  
   }
	/*@Override
	public int compare(AssinmentQ10 o1, AssinmentQ10 o2)
	{
	
		return  o2.name.compareTo(o1.name);
	}*/
   /*@Override
  	public int compare(AssinmentQ10 o1, AssinmentQ10 o2)
	{
		
		return  ((Integer)o1.id).compareTo(o2.id);
	}*/
	@Override
	public int compare(AssinmentQ10 o1, AssinmentQ10 o2)
	{
		
		return  ((Double)o1.marks).compareTo(o2.marks);
	}
 

}
