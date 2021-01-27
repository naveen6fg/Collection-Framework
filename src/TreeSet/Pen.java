package TreeSet;

import java.util.Comparator;

public class Pen implements Comparator<Pen>//Comparable<Pen>
{
   String pName;
   double price;

   
   public Pen(String pName, double price)
   {
	
	this.pName = pName;
	this.price = price;
  }

public Pen()
{
	
}


/*@Override
public int compareTo(Pen p)
{
  if(this.price==p.price)
  {
	  return p.pName.compareTo(this.pName);
  }
  else
  {
	  return ((Double)this.price).compareTo(p.price);
	    
  }
}*/


/*@Override
public int compare(Pen p1,Pen p2)
{
	return ((Double)p2.price).compareTo(p1.price);
	
	/*if(p1.price==p2.price)
	{
		return p1.pName.compareTo(p2.pName);
	}
	else {
		return  ((Double)p2.price).compareTo(p1.price);
	}*/
	
//}


@Override
public int compare(Pen p1,Pen p2)
{
	return ((Integer)(p2.hashCode())).compareTo(((Integer)(p1.hashCode())));
}
   
   public String toString()
   {
	   return pName+"     "+price;
   }
   
   
   @Override
   public int hashCode()
   {
     return (int)price;	   
   }
   
   
}
