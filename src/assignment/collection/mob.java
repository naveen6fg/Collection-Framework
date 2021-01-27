package assignment.collection;

import java.util.Comparator;

public class mob implements Comparable<mob>,Comparator<mob>
{

	
	String name;
	double price;
	public mob(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public mob()
	{


		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compare(mob o1, mob o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString()
	{
		return name+"\t\t"+price;
	}
	@Override
	public int compareTo(mob o)
	{
		
		return this.name.compareTo(o.name);
	}
	
	
}
