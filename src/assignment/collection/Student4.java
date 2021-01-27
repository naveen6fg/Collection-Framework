package assignment.collection;

public class Student4
{
	  String name;
	  double grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Student4(String name, double grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
	public String toString()
	{
		return name+"\t\t"+grade;
	}
}
