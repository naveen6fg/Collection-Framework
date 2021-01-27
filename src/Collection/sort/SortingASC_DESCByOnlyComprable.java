package Collection.sort;

import java.util.*;


 class Student1 implements Comparable<Student1>
{
	 int id;
	 String name ;
	
	
	public Student1(int id, String name)
	{
	
		this.id = id;
		this.name = name;
	}
	
	public Student1()
	{
		
	}
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return "ID = "+id+ "    NAME = "+name;
	}
	
	

	@Override
	public int compareTo(Student1 o)
	{
	  if(this.id>o.id )  //return o.id - this.id ;
	  {
		  return 1;
	  }
	  else if(this.id<o.id )
	  {
		  return -1;
	  }
	  else 
	  {
		return 0;//this.name.compareTo(o.name);
	  }
	
	}
	
}



 


