package Student;

import java.util.Comparator;

public class Student implements Comparator<Student>
{
	private String name;
	private int id;
	private double marks;
	
	public Student(String name, int id, double marks) 
	{	
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public Student()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return name+"\t\t"+id+"\t\t"+marks;
	}
	
	
	@Override
	public int compare(Student s1, Student s2)
	{
		return ((Integer)s2.id).compareTo(s1.id);
	}
}
