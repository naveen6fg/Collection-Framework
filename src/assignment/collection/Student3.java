package assignment.collection;

public class Student3
{
  String name;
  double marks;

  

 public Student3(String name, double marks)
{
		
		this.name = name;
		this.marks = marks;
}
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
	return name+"\t\t"+marks;
}
}
