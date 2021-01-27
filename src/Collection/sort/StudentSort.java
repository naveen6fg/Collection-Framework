package Collection.sort;

import java.util.*;

import Student.Student;

public class StudentSort
{
  public static void main(String[] args)
  {
    
	  List<Student> l = new ArrayList<Student>();
		  
	    l.add(new Student("Simba", 50, 65.56));
		l.add(new Student("Singa", 30, 50.54));
		l.add(new Student("Manga", 20, 45.54));
		l.add(new Student("Ranga", 10, 76.45));
		l.add(new Student("Josha", 40, 59.32));
		l.add(new Student("Naveen", 49, 70.32));
		
		System.out.println("Befor sort id ");
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		Collections.sort(l,new Student());
		
		
		System.out.println();
		System.out.println("After sort id");
		System.out.println("------------------------------------------------------------");
		System.out.println();
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
  }
}