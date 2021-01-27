package Map;

import java.util.ArrayList;
import java.util.List;

public class FruitsListService
{
  public static void main(String[] args)
  {
	  
	   List<String> list=addFruitToList("apple,mango,Cherry,papaya,apple,Apple");
	   
	   
	   System.out.println(list);
	   
	   /*for(String i:list)
	   {
		   System.out.println(i);
	   }*/
  }
  
  public static List<String> addFruitToList(String s)
  {
	 
	  
	  List<String> ls =new ArrayList<String>();
	  //ls.add(s);
	  String[]  fruit= s.split(","); 
   
	 /* for(int i=0;i<fruit.length;i++)
	  {
		  if(!ls.contains(fruit[i]))
		  {
			  ls.add(fruit[i]);  
		  }
		  
	  }*/
	  
	
	
	 
	  
	     for(String fruit1: fruit)
	     {
	    	 if(ls.isEmpty())
	    	 {
	    		 ls.add(fruit1);
	    	 }
	    	 else
	    	 {
	    		 boolean fruitExist=false;
	    	     for(int i=0;i<ls.size();i++)
	    	     {
	    	    	 //String fruits= ls.get(i);
	    	    	 if(fruit1.equalsIgnoreCase(ls.get(i)))
	                    {
	                    	fruitExist=true;
	                    	break;
	                    } 
	    	     }
	    	     if(!fruitExist)
	    	     {
	    	    	 ls.add(fruit1);
	    	     }
	    	     
	    	 }
	     }
	     
	     
	  
	  return ls;
  }
}
