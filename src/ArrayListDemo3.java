

import java.util.*;

public class ArrayListDemo3 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add(32.32);
		l.add("Hello");
		l.add(32);
		l.add(76);
		l.add(123);
		l.add(76.67f);
		l.add("America");
		l.add("Singapore");
		l.add("World");		
		l.add(32.32f);
		l.add(121);
		l.add(47);
		l.add(67);
		l.add(124);
		
		//dispStringIntegerObj(l);
		
		//dispStringStartsWithS(l);
		
		dispEvenNum(l);
		
		//countPrimeNum(l);
	}
	
	public static void countPrimeNum(List l)
	{
		for(int i = 0 ; i < l.size(); i++)
		{
			Object obj = l.get(i);
			Integer I = (Integer)obj;
			
			if(obj instanceof Integer)
			{
				
				if(isPrime(I))
				{
					System.out.println(obj);
				}
			}
		}
	}
	
	public static boolean isPrime(int num)
	{
		for(int i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	public static void dispStringIntegerObj(List l)
	{
		for(int i = 0 ; i < l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof String || obj instanceof Integer)
			{
				System.out.println(obj);
			}
		}
	}
	
	public static void dispStringStartsWithS(List l)
	{
		for(int i = 0 ; i < l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof String)
			{			
				if(((String)obj).startsWith("S"))
				{
					System.out.println(obj);
				}				
			}
		}
	}
	
	public static void dispEvenNum(List l)
	{
		for(int i = 0 ; i < l.size(); i++)
		{
			Object obj = l.get(i);
			
			
			if(obj instanceof Integer)
			{	
				Integer i1=(Integer)obj;
			
				if(i1 % 2 == 0)
				{
					
					System.out.println(obj);
				}
			}
		}
	}
	
}
