package College;              //with Arrays

public class College
{
	//private Student s;
	private Student[] sa;
    private int index;
	
//	  public void join(Student s)   Store single object
//	  {
//		  this.s=s;
//		 
//	  }

	 public void join(Student s)   //Store multiple array object
	  {
		  this.sa[index]=s;
		  index++;
		 
	  }
	
	public College()  //constructor
	  {
		  sa= new Student[5];
		  
	  }
	  
	  void display()   //printing arraysa elements
	  {
		  for(int i=0;i< sa.length;i++)
		  {
		    System.out.println(sa[i]);
		  }
	  }
}



