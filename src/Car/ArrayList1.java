package Car;

import java.util.*;

import Student.Student;

public class ArrayList1
{
    public static void main(String[] args)
    {
    	List  l = new  ArrayList();
    	
    	l.add(new Car("Audi","Black",1200000.00));
    	l.add(new Car("BMW","Slety",500000.00));
    	l.add(new Car("Marsati","Light b",6200000.00));
    	l.add(new Car("Bentley","Green",1900000.00));
    	l.add(new Car("RangeRo","Red",6200000.00));
    	l.add(new Car("Jaguar","Blue",9200000.00));
    	
    	
    	displayCarObject(l);
    	System.out.println();
    	displayRedColCarObject(l);
    	System.out.println();
    	displayPriceAboveSomeAmt(l);
    	System.out.println();
    	maxCarPrice(l);
    }
    
    static void displayCarObject(List l)
    {
    	System.out.println("Displayed all object");
    	System.out.println("---------------------------------------------------------");
    	System.out.println("Name\t\t\tColor\t\t\tPrice");
		System.out.println("---------------------------------------------------------");
    	for(int i = 0 ; i < l.size(); i++)
		{
			
			Object obj = l.get(i);
			
			if(obj instanceof Car)
			{
				
					System.out.println(obj);
				
			}
			
		}
    }
    static void displayRedColCarObject(List l)
    {
    	System.out.println("Displaying red color car only");
    	System.out.println("---------------------------------------------------------");
    	System.out.println("Name\t\t\tColor\t\t\tPrice");
		System.out.println("---------------------------------------------------------");
    	for(int i = 0 ; i < l.size(); i++)
		{
			
			Object obj = l.get(i);
			
    	
    	if(obj instanceof Car)
		{	
			if(((Car)obj).getcColor()=="Red")
			{
				System.out.println(obj);
			}
         }
	   }
    }
    
    static void displayPriceAboveSomeAmt(List l)
    {
    	System.out.println("Car above on some Price 500000");
    	System.out.println("---------------------------------------------------------");
    	System.out.println("Name\t\t\tColor\t\t\tPrice");
		System.out.println("---------------------------------------------------------");
    	for(int i = 0 ; i < l.size(); i++)
		{
			
			Object obj = l.get(i);
			
    	
    	if(obj instanceof Car)
		{	
			if(((Car)obj).getcPrice()>500000)
			{
				System.out.println(obj);
			}
         }
	   }
    
    
    }
    
    static void maxCarPrice(List l)
    {
    	System.out.println("Display max car price");
    	System.out.println("---------------------------------------------------------");
    	System.out.println("Name\t\t\tColor\t\t\tPrice");
		System.out.println("---------------------------------------------------------");
    	for(int i = 0 ; i < l.size(); i++)
		{
			
			Object obj = l.get(i);
			
//    	
//    	if(obj instanceof Car)
//		{	
			//if((Car)obj).getcPrice().max(l))
			//{
				System.out.println(Collections.max(l));
			//}
        //}
      //}
   }
}
}