package Set;

import java.util.*;

public class Duck_no
{
   public static void main(String[] args) {
	
	   int num=198;
	   List<Integer> l =new ArrayList<Integer>();
	  int lastDigit=0;
	   while(num>0)
	    {
	    	lastDigit=num%10;
	    	l.add(lastDigit);
	    	num=num/10;
	    }
	   Collections.reverse(l);
	   
	  // for(int i=0;i<l.size();i++)
	   //{
		  
		   if(l.contains(0))
		   {
			   System.out.println("It is a duck no");
		   }
		   else
		   {
			   System.out.println("It is not a duck no");
		   }
		    
	   //}
}
}
