package StudCRUD.Operation;

import java.util.List;
import java.util.Scanner;

public class StudentDataBase 
{
	public Scanner sc;
	public List<Stud> l;
		
	public StudentDataBase(Scanner sc, List<Stud> l) 
	{	
		this.sc = sc;
		this.l = l;
	}

	public void addStudent()
	{
		Stud s = readStudentDetails();
		l.add(s);
	}
	
	public Stud readStudentDetails()
	{
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name = sc.nextLine();
		
		System.out.println("Enter the id");
		int id = sc.nextInt();
		
		System.out.println("Enter the marks");
		double marks = sc.nextDouble();
		
		System.out.println("Enter the mobile");
		long mobile = sc.nextLong();
		
		return new Stud(name, id, marks, mobile);
	}
	public void removeStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter the id to be removed");
			int id = sc.nextInt();
			
			for(int i = 0 ; i < l.size(); i++)
			{
				Stud s = l.get(i);
				
				if(s.getId() == id)
				{
					l.remove(i);
					dispStudent();
					return;
				}
			}
			
			System.out.println("Student with id "+id+" not fonud !!");
		}
		else
		{
			System.out.println("List is Empty");
		}
	}
	
	public void searchStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter the id to be searched");
			int id = sc.nextInt();
			
			for(int i = 0 ; i < l.size(); i++)
			{
				Stud s = l.get(i);
				
				if(s.getId() == id)
				{
					System.out.println("Student found !!");
					return;
				}
			}
			
			System.out.println("Student with id "+id+" not fonud !!");
		}
		else
		{
			System.out.println("List is Empty");
		}
	}
	
	public void updateStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter the id to be updated");
			int id = sc.nextInt();
			
			System.out.println("1.Mobile\n2.Marks");
			System.out.println("Enter your choice");
			
			int ch = sc.nextInt();
			
			if(ch == 1)
			{
				updateMobile(id);
				dispStudent();
			}
			else
			{
				updateMarks(id);
				dispStudent();
			}			
		}
		else
		{
			System.out.println("List is Empty");
		}
	}
	
	public void updateMobile(int id)
	{
		for(int i = 0 ; i < l.size(); i++)
		{
			Stud s = l.get(i);
			
			if(s.getId() == id)
			{
				System.out.println("Enter the new Mobile");
				long newMobile = sc.nextLong();				
				s.setMobile(newMobile);
				return;
			}
		}
		
		System.out.println("Student with id "+id+" not found !!");
	}
	
	public void updateMarks(int id)
	{
		for(int i = 0 ; i < l.size(); i++)
		{
			Stud s = l.get(i);
			
			if(s.getId() == id)
			{
				System.out.println("Enter the new marks");
				double newMarks = sc.nextDouble();			
				s.setMarks(newMarks);
				return;
			}
		}
		
		System.out.println("Student with id "+id+" not found !!");
	}
	public void dispStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Name\t\tId\t\tMarks\t\tMobile");
			System.out.println("--------------------------------------------------------");
			
			for(int i = 0 ; i < l.size(); i++)
			{
				System.out.println(l.get(i));
			}
		}
		else
		{
			System.out.println("List is Empty");
		}
	}
	
	public void sortStudent()
	{
		//TBD
	}
}
