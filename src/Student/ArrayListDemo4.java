package Student;

import java.util.*;

import Car.Car;
import Collection.sort.SortDemo;

public class ArrayListDemo4 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		
		l.add(new Student("Simba", 50, 65.56));
		l.add(new Student("Singa", 30, 50.54));
		l.add(new Student("Manga", 20, 45.54));
		l.add(new Student("Ranga", 10, 76.45));
		l.add(new Student("Josha", 40, 59.32));
		l.add(new Student("Naveen", 49, 70.32));
		

		dispStudentDetails(l);
		dispStudentNameStartwithS(l);
		System.out.println();
		dispStudentNameWhoseMarksBW50to60(l);
		System.out.println();
		dispStudentNameStartwithSandMarksLessThan60(l);
		

	}
	
	
	public static void dispStudentDetails(List l)
	{
		
		
		System.out.println("Name\t\tId\t\tMarkss");
		System.out.println("-------------------------------------");
		
		
		for(int i = 0 ; i < l.size(); i++)
		{
             Object obj = l.get(i);
			
			 Student s= (Student)obj;
			 System.out.println(l.get(i));
		}
	}
	
	
	
	public static void dispStudentNameStartwithS(List l)
	{
		
		
		System.out.println("Name\t\tId\t\tMarkss");
		System.out.println("-------------------------------------");
		
		
		for(int i = 0 ; i < l.size(); i++)
		{
			
			Object obj = l.get(i);
			
			
			if(obj instanceof Student)
			{
				if(((Student)obj).getName().startsWith("S") )
				{
					System.out.println(obj);
				}
			}
		
		}
	}
	
	public static void dispStudentNameWhoseMarksBW50to60(List l)
	{
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("-------------------------------------");
    	for(int i = 0 ; i < l.size(); i++)
		{
			
			Object obj = l.get(i);
			
    	
    	if(obj instanceof Student)
		{	
			if(((Student)obj).getMarks()>50 && ((Student)obj).getMarks()<60)
			{
				System.out.println(obj);
			}
         }
	   }
	}
	
	
	static void dispStudentNameStartwithSandMarksLessThan60(List l)
	{
		System.out.println("Name\t\tId\t\tMarkss");
		System.out.println("-------------------------------------");
		
		
		for(int i = 0 ; i < l.size(); i++)
		{
			
			Object obj = l.get(i);
			
			Student s= (Student)obj;   //Object is type casted in Student type		
			
			if(obj instanceof Student)
			{
				if((s.getName().startsWith("M") && ((Student)obj).getMarks()<50))
				{
					System.out.println(obj);
				}
			}
		
		}
	}
	
	
}
