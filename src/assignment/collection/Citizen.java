package assignment.collection;

public class Citizen
{
	String name;
	int age;
	
	
	public Citizen(String name, int age)
	{
		
		this.name = name;
		this.age = age;
	}
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return name+"\t\t"+age;
	}
	
	
}
