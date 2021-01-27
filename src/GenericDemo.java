import java.util.*;

public class GenericDemo
{
    public static void main(String[] args)
    {
    	List l= addList();
    	
	      displaySting(l);
	}
    
    
    static List addList()
    {
   
       List<String> s =new ArrayList<String>(); 	
	   
	   s.add("Jsp");
	   s.add("SAga");
	   s.add("Servelet");
	   s.add("SAgar");
	   s.add("Dipesh");
	   s.add("");
	   s.add("Yashpal");
	   
	   return s;
   }
    
    static void  displaySting(List l)
    {
    	for(int i=0 ;i<l.size();i++)
    	{
    		String s= (String) l.get(i);
    		
    		if(s.contains("SA"))
    		{
    			System.out.println(s);
    		}
    	}
    	
    }
}