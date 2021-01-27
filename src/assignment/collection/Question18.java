package assignment.collection;

import java.util.*;
import java.util.Map.Entry;

public class Question18 
{
	Scanner sc;
	Map<Integer,String> m;
	
	public Question18(Scanner sc, Map<Integer, String> m) {
		super();
		this.sc = sc;
		this.m = m;
	}
	public  void read()
	{
		
		System.out.println("Enter the EmpId");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		m.put(id, name);
		
	}
	public  void disp() {
		
		Set<Entry<Integer,String>> entry = m.entrySet();
		Iterator<Entry<Integer,String>> itr=entry.iterator();
		System.out.println("ID\tName");
		System.out.println("---------------------------------");
		while(itr.hasNext())
		{
			Entry<Integer,String> e= itr.next();
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}
	
	public void checkUser()
	{
		System.out.println("Enter the key to be searched");
		int key=sc.nextInt();
		if(m.containsKey(key))
		{
			System.out.println("Employee found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	public void deleteUser()
	{
		System.out.println("Enter the key to be deleted");
		int key=sc.nextInt();
		m.remove(key);
		//disp();
	}
	public void dispName()
	{
		Set<Entry<Integer,String>> entry = m.entrySet();
		Iterator<Entry<Integer,String>> itr=entry.iterator();
		System.out.println("Name");
		while(itr.hasNext())
		{
			Entry<Integer,String> e= itr.next();
			System.out.println(e.getValue());
		}
	}
public  void dispId() {
		
		Set<Entry<Integer,String>> entry = m.entrySet();
		Iterator<Entry<Integer,String>> itr=entry.iterator();
		System.out.println("ID");
		while(itr.hasNext())
		{
			Entry<Integer,String> e= itr.next();
			System.out.println(e.getKey());
		}
	}
}
