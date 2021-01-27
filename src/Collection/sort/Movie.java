package Collection.sort;

import java.util.Comparator;

public class Movie implements Comparator<Movie>
{
	private String mName;
	private double mPrice;
	
	public Movie(String mName, double mPrice)
	{
	
		this.mName = mName;
		this.mPrice = mPrice;
	}
	public Movie()
	{
		
	}
	
	@Override
	public String toString()
	{
		return mName+"     "+mPrice;
		
	}
	
	public int compare(Movie m1,Movie m2)
	{
		if(m1.mPrice==m2.mPrice)
		{
			return m1.mName.compareTo(m2.mName);
		}
		else
		{
			return ((Double)m2.mPrice).compareTo(m1.mPrice);
			
		}
	}
	
	
	
}
