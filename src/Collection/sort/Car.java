package Collection.sort;

import java.util.Comparator;

public class Car implements Comparator<Car>
{
     private String cName;
     private String cOwner;
     private int cYear;
	
     
     public Car(String cName, String cOwner, int cYear)
     {
	
		this.cName = cName;
		this.cOwner = cOwner;
		this.cYear = cYear;
	}
     
     public Car()
     {
		
	  }

	public String toString()
     {
    	 return   cName+"        "+cOwner+"       "+cYear;
     }
     
     public int compare(Car c1,Car c2)
     {
    	 return   ((Integer)c2.cYear).compareTo(c1.cYear);
     }
         
}
