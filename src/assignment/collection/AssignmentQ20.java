package assignment.collection;

import java.util.*;

public class AssignmentQ20
{
	
	
	
	
	public static void main(String[] args)
	{
       Set<student20> s=new HashSet();
       //Set<Integer> s=new LinkedHashSet<Integer>();
       //Set s=new TreeSet();
       
  
//       s.add(23);
//       //s.add(null);
//       s.add(98);
//       s.add(23);
//       s.add(60);
//       s.add(34);
//       s.add(34);
//       s.add(34);
//       s.add(23);
       
       
       
       s.add(new student20(22, "Piyu", 88.02));
       s.add(new student20(22, "Piyu", 84.02));
       s.add(new student20(22, "Piyu", 88.02));
       s.add(new student20(21, "Jack  ", 74.70));
       s.add(new student20(21, "Jack  ", 74.70));
       s.add(new student20(66, "Piter ", 77.34));
       s.add(new student20(66, "Piter ", 77.34));
       s.add(new student20(11, "Thasom", 98.33));
       s.add(new student20(73, "John  ", 36.05));
       s.add(new student20(66, "Piter ", 77.34));
       
       
       
       
       for(Object obj:s)
       {
    	 System.out.println(obj);  
       }
       
	}
   
}
