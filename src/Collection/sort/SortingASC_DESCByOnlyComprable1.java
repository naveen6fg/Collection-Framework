package Collection.sort;

import java.util.*;
class SortingASC_DESCByOnlyComprable 
{
	
 public static void main(String[] args)
 {
	  
	  List<Student1> l=  new ArrayList<Student1>();
	  
	  l.add(new Student1(29, "Naveen"));
	  l.add(new Student1(22, "Suman"));
	  l.add(new Student1(29, "Dolly"));
	  l.add(new Student1(11, "Pooja"));
	  l.add(new Student1(56, "Abhilasha"));
	  
	  System.out.println(l);
	 
	  System.out.println();
	  Collections.sort(l);
	  
	  l.forEach(System.out::println);  // Lembda Expression
	  
	  System.out.println();
	  
	  for(int i=0;i<l.size();i++)
	  {
		  System.out.println(l.get(i));
	  }
	  
 }
}
