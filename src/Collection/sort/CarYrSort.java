package Collection.sort;

import java.util.*;


public class CarYrSort
{
      public static void main(String[] args)
      {
		  List<Car> c= new ArrayList<Car>();
		  //Collection<Car> c= new ArrayList<Car>();
		  
		  c.add(new Car("RngeRover", "Naveen Roy", 2025));
		  c.add(new Car("Audi     ", "Aditya    ", 2028));
		  c.add(new Car("BMW      ", "Ankit     ", 2030));
		  c.add(new Car("Toyta    ", "Angesh    ", 2023));
		  c.add(new Car("Nisan    ", "Ratnesh   ", 2024));
		  
		 
		 // System.out.println(c);
		  System.out.println("\nBEFORE SORT YEAR ");
		  System.out.println("------------------------------------");
	      System.out.println("\nCarName\t\tOWNER\t\tBUY-YEAR");
	      System.out.println("-----------------------------------------");
			for(int i=0;i<c.size();i++)
			{
				System.out.println(c.get(i));
			}
			Collections.sort(c,new Car());
			
			
			System.out.println();
			System.out.println("AFTER SORT YEAR");
			System.out.println("------------------------------------");
		     System.out.println("\nCarName\t\tOWNER\t\tBUY-YEAR");
		    System.out.println("-----------------------------------------");
		
			
			for(int i=0;i<c.size();i++)
			{
				System.out.println(c.get(i));
	       }
      }
}
