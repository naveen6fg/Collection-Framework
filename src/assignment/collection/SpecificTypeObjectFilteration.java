package assignment.collection;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;

public class SpecificTypeObjectFilteration
{
    public static void main(String[] args)
    {
	    List  l =new ArrayList();
	    l.add(34);
	    l.add("Naveen");
	    l.add(56);
	    l.add('a');
	    l.add(3.54);
	    l.add(32);
	    l.add('B');
	    l.add(99);
	    l.add("Sanjay");
	    
	    filerIntegerObject(l);
	    System.out.println();
	    filteEvenObject(l);
	    System.out.println();
	    stringObjectStartWithS(l);
	}
    
    static void filerIntegerObject(List l)
    {
    	for(int i=0;i<l.size();i++)
    	{
    		Object obj   = l.get(i);
    		//Integer i1 =(Integer)obj;

    		if(obj instanceof Integer)
			{
    			System.out.println(obj);
			}
    	}
    }
    
    static void  filteEvenObject(List l)
    {
    	for(int i=0;i<l.size();i++)
    	{
    		Object obj   = l.get(i);
    		

    		if(obj instanceof Integer)
			{
    			Integer i1 =(Integer)obj;
    			if(i1%2==0)                    //if((Integer)obj%2==0)
    			{
    				System.out.println(obj);
    			}
			}
    	}
    }
    
    static void stringObjectStartWithS(List l)
    {
    	for(int i=0;i<l.size();i++)
    	{
    		Object obj   = l.get(i);
    		

    		if(obj instanceof String)
			{
    			String s= (String)obj;
    			
    			if(s.contains("S"))                    
    			{
    				System.out.println(obj);
    			}
			}
        }
    }
}
