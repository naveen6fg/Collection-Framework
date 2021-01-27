package Map;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class FileQuestion1
{
    public static void main(String[] args) throws IOException
    {
    	Map<String, Integer> m = new LinkedHashMap<String, Integer>();
    	
    	
	    BufferedReader br =new BufferedReader(new FileReader(new File(("‪C:\\Users\\Roy\\Desktop\\Test.txt"))));
	   // BufferedReader br =new BufferedReader(new FileReader(new File(("V:\\Devlopment workspace\\Assignment2\\Test.txt"))));
	    
	    String str=null;
	    String[] word=null; 
	    
	    int count1=0;
	    int count2=0;
	    
	    while ((str = br.readLine()) != null)
	    {
	    	count1++;
	    	word=str.split(" ");
	    	
	    	
	    	for(int i=0;i<word.length;i++)
	    	{
	    		        if(m.containsKey(word[i]))
	    			     {
	    		        	count2++;
	    		     	   m.put(word[i],(m.get(word[i])+1));
	    			     }
	    			     else
	    			     {
	    			    	 count2++;
	    			    	 m.put(word[i], 1);
	    		     	  }
	    		     	 
	    			     //System.out.println(word[i]);     	  
	    	}
	    		
	    		//System.out.println();
	    }
	   
	    
	    
	    	
	    
	    
	    //System.out.println(m);		
	    
	    
	   /* System.out.println("-----------------------------------------");
	   for(int i=0;i<word.length;i++)
    	{
    		System.out.println(word[i]);
	    }*/
	   
	   
	   
	               Set<Entry<String,Integer>> s=m.entrySet();
	               Iterator<Entry<String,Integer>> itr=s.iterator();
	              
	               System.out.println("----------------------------------------------------");
	               System.out.println("Words\t\t\t\tOccurance");
	               System.out.println("----------------------------------------------------");
	               int count=0;
	               while(itr.hasNext())
	               {
	            	   Entry<String,Integer> e=  itr.next();
	                   count++;
	            	   System.out.println(e.getKey()+"\t\t\t\t"+e.getValue());
	               }
	   
	               
	               itr=s.iterator();
	               System.out.println();
	               System.out.println("----------------------------------------------------");
	               System.out.println("More than thrice occurance of word");
	               System.out.println("----------------------------------------------------");
	               
	               while(itr.hasNext())
	               {
	            	   Entry<String,Integer> e=  itr.next();
	            	   if(e.getValue()>3)
	            	   System.out.println(e.getKey()+"\t\t\t\t"+e.getValue());
	               }
	   
	               
	               
	               
	               itr=s.iterator();
	               System.out.println();
	               System.out.println("----------------------------------------------------");
	               System.out.println("First non -repeated word");
	               System.out.println("----------------------------------------------------");
	               
	               while(itr.hasNext())
	               {
	            	   Entry<String,Integer> e=  itr.next();
	            	   if(e.getValue()==1)
	            	   {
	            	      System.out.println(e.getKey()+"\t\t\t\t"+e.getValue());
	            	      break;
	            	   }
	               }
	               
	               
	               
	               
	               itr=s.iterator();
	               System.out.println();
	               System.out.println("----------------------------------------------------");
	               System.out.println("Once occurance word");
	               System.out.println("----------------------------------------------------");
	               
	               while(itr.hasNext())
	               {
	            	   Entry<String,Integer> e=  itr.next();
	            	   if(e.getValue()==1)
	            	   {
	            	      System.out.println(e.getKey()+"\t\t\t\t"+e.getValue());
	            	      
	            	   }
	               }
	               
	               
	               
	               
	               itr=s.iterator();
	               System.out.println();
	               System.out.println("----------------------------------------------------");
	               System.out.println("Heighest occurance of word");
	               System.out.println("----------------------------------------------------");
	               int large=0;
	               while(itr.hasNext())
	               {
	            	   Entry<String,Integer> e=  itr.next();
	            	   if(e.getValue()>large)
	            	   {
	            		   large=e.getValue();
	            	   }
	            	 
	               }
	               
	               
	               itr=s.iterator();
	               while(itr.hasNext())
	               {
	            	   Entry<String,Integer> e=  itr.next();
	            	   if(e.getValue()==large)
	            	   System.out.println(e.getKey()+"\t\t\t\t"+e.getValue());
	               }
	               
	               
	               System.out.println();
	               System.out.println("------------------------------------------");
	               
	               System.out.println("Total distinct words in file ="+count);
	               System.out.println("Total no of lines in file ="+count1);
	       	       System.out.println("Total word in file="+count2);
	              
	               
    }
}

