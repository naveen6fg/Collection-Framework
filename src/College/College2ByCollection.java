package College;      //with collections

import java.util.*;

public class College2ByCollection
{
   ArrayList<Student> al1;
   ArrayList<Faculty> al2;

  public College2ByCollection()
  {
	al1= new ArrayList();
	//al2= new ArrayList();  // getting nullPointer exception
  }
   
  
  void join(Student s)
  {
	  al1.add(s);
  }
 
  void join(Faculty f) //join overloaded method
  {
	  al2.add(f);
  }
  
  void displayStudent()
  {
	  for(int i=0; i<al1.size();i++)
	  {
		  System.out.println(al1.get(i));
	  }
  }
  
  
  void displayFaculty()
  {
	  System.out.println();
	  for(int i=0; i<al2.size();i++)
	  {
		  System.out.println(al2.get(i));
	  }
  }
   
   
   
}
