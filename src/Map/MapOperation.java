package Map;
import java.util.*;
import java.util.Map.Entry;

public class MapOperation
{
   public static void main(String[] args)
   {
	 // Map<Integer, String> m = new HashMap<Integer,String>();      //gives object in random order and no duplicate key allowed value can be duplicate
	   Map<Integer, String> m = new Hashtable<Integer,String>();   //HashMap is not thread-safe but Hashtable is thread-safe. This means you cannot use HashMap in a multi-threaded Java application without external synchronization.
	  //Map<Integer, String> m = new LinkedHashMap<Integer,String>();  //gives object in preserve order and no duplicate key allowed value can be duplicate
	 //Map<Integer, String> m = new TreeMap<Integer,String>();   //gives object in sorted list and no duplicate key allowed value can be duplicate
	 
	 	  
	  m.put(10, "India");
	  m.put(50, "Austriya");
	  m.put(13, "Paris");
	  m.put(70, "maldives");
	  m.put(90, "Goa");
	  m.put(25, "London");
	  m.put(25, "USA");//key and value both are duplicate
	  
	 // System.out.println(m);
	  
	     Set<Entry<Integer,String>> entry= m.entrySet(); ///convert into Set
	     Iterator<Entry<Integer,String>> itr= entry.iterator();   //creating iterator for set to retrieve objects
	  
	     System.out.println("key\tValues");
	     System.out.println("------------------");
	     
	     while (itr.hasNext())
	     {
			Entry<Integer,String> e =  itr.next();
			
			if(e.getValue().equals("maldives"))   //replace operation
			{
				e.setValue("Banngalore");
			}
			System.out.println(e.getKey()+"\t"+e.getValue());
			
			
			
		}
   }
}
