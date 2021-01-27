package assignment.collection;
import java.util.*;
import java.util.Map.Entry;
public class SortHashMap
{
      public static void main(String[] args)
      {
		  // Map<Integer, String> m= new HashMap<Integer, String>();  //sorting by converting into TreeMap
		  // Map<Integer, String> m= new Hashtable<Integer, String>();
		   Map<Integer, String> m= new LinkedHashMap<Integer, String>();
		   
		   m.put(17, "naveen");
		   m.put(11, "yashpal");
		   m.put(15, "Dipesh");
		   m.put(19, "Sriniwas");
		   m.put(10, "Srinidhi");
		   m.put(14, "Vinay");
		   m.put(18, "Papu");
		
		   Map<Integer, String>  s= new TreeMap<Integer, String>(m);
		  // System.out.println(m);
		   
		   
		   Set<Entry<Integer, String>> s1=	s.entrySet();
	        Iterator<Entry<Integer, String>> ite =  s1.iterator();
	        
	        
	        System.out.println("ID\t\tNAME");
	        System.out.println("----------------------------------------------");
	        while (ite.hasNext())
	        {
				Entry<Integer, String> e = ite.next();
				System.out.println(e.getKey()+"\t\t"+e.getValue());
				
			}
	  }
}
