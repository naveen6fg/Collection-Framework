package assignment.collection;

import java.util.*;
import java.util.Map.Entry;

public class Question19 
{
	Scanner sc;
	Map<String, Integer> m;
	
	public Question19(Scanner sc, Map<String,Integer> m) {
		
		this.sc = sc;
		this.m = m;
	}
	public  void read()
	{
		sc.nextLine();
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter the Weather");
		int weather=sc.nextInt();
		sc.nextLine();
		
		m.put(name,weather);
		//disp();
		
	}
	public  void disp() {
		
		Set<Entry<String,Integer>> entry = m.entrySet();
		Iterator<Entry<String,Integer>> itr=entry.iterator();
		System.out.println("Name\tWeather");
		System.out.println("---------------------------------");
		while(itr.hasNext())
		{
			Entry<String,Integer> e= itr.next();
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}
	
	public void checkCity()
	{
		sc.nextLine();
		System.out.println("Enter the City to be searched");
		String key=sc.nextLine();
		if(m.containsKey(key))
		{
			System.out.println("City found");
		}
		else
		{
			System.out.println("City Not Found");
		}
	}
	public void deleteCity()
	{
		System.out.println("Enter the City to be deleted");
		int key=sc.nextInt();
		m.remove(key);
		disp();
	}
	public void dispWeather()
	{
		Set<Entry<String,Integer>> entry = m.entrySet();
		Iterator<Entry<String,Integer>> itr=entry.iterator();
		System.out.println("Weather");
		while(itr.hasNext())
		{
			Entry<String, Integer> e= itr.next();
			System.out.println(e.getValue());
		}
	}
public  void dispName() {
		
		Set<Entry<String,Integer>> entry = m.entrySet();
		Iterator<Entry<String,Integer>> itr=entry.iterator();
		System.out.println("Name");
		while(itr.hasNext())
		{
			Entry<String,Integer> e= itr.next();
			System.out.println(e.getKey());
		}
	}
public void update()
{
	sc.nextLine();
	System.out.println("Enter the name to be updated");
	String s=sc.nextLine();
	System.out.println("Enter the new tempertaure");
	int n=sc.nextInt();
	Set<Entry<String,Integer>> entry = m.entrySet();
	Iterator<Entry<String,Integer>> itr=entry.iterator();
	
	while(itr.hasNext())
	{
		Entry<String, Integer> e= itr.next();
		if(e.getKey().equals(s))
			e.setValue(n);
	}
	disp();
}
}

