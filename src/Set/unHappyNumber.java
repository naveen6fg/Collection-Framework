package Set;

import java.util.*;

public class unHappyNumber
{
   public static void main(String[] args)
   {
			int num=135;
		    List< Integer>	l =new ArrayList<Integer>();
		    int lastDigit=0;
		    int temp=num;
		    while(num>0)
		    {
		    	lastDigit=num%10;
		    	l.add(lastDigit);
		    	num=num/10;
		    }
		    System.out.println(l);
		    Collections.reverse(l);
		    System.out.println(l);
		    
		    
		    int sum=0;
		    int store=0;
		    for(int i=0;i<l.size();i++)
		    {
		    	
		    	store=(int)Math.pow(l.get(i),i+1);
		    	sum=sum+store;
		    	
		    }
		    
		    System.out.println(sum);
		    System.out.println(temp);
		    
		   
		    if(temp==sum)
		    {
		    	System.out.println("Num is a unHappy number");
		    }
		    else
		    {
		      System.out.println("Num is not a unHappy number");
            }
  }
}
