package assignment.collection;

import java.util.*;

import Student.Student;

public class AssinmentQ3_4_same
{
     public static void main(String[] args)
     {
	  
	   List ar= new LinkedList();  //List ar= new ArrayList();
	   
	   ar.add(36.99);
	   ar.add(new Student3("Saurabh",76.99));
	   ar.add(77777);
	   ar.add(new Moble("red",53432));
	   ar.add(4.88);
	   ar.add("Sanjay");
	   ar.add(new Student3("Anjli",66.99));
	   ar.add(96);
	   ar.add(new Moble("Pink",532));
	   ar.add('A');
	   ar.add(new Student3("Radhe",96.00));
	   
	   //for(Object obj:ar)
	   //System.out.println(obj);
	   System.out.println("Student    Objects");
	   System.out.println("-------------------------------");
	   displayOnlyStudentObject(ar);
	   System.out.println();
	   
	   
	   System.out.println("Mobile    Objects");
	   System.out.println("-------------------------------");
	   displayOnlyMobileObject(ar);
	   
	   System.out.println();
	   System.out.println("Marks   above 60");
	   System.out.println("-------------------------------");
	   StudentMarksGT60(ar);

	   System.out.println();
	   System.out.println("Start name with s and above 60");
	   System.out.println("-------------------------------");
	   StartNmeWithStudentMarksGT60(ar);
	 
	 }
     
     
     static void displayOnlyStudentObject(List l)
     {
    	for(Object obj:l)
    	{
    		//Student s =(Student)obj;
    		if(obj instanceof Student3)
    		{
    			 System.out.println(obj.toString());
    		}
    	}
  	  
     }

     
     static void displayOnlyMobileObject(List l)
     {
    	 for(Object obj:l)
     	{
     		
     		if(obj instanceof Moble)
     		{
     			 System.out.println(obj.toString());
     		}
     	}
     }
     
     static void StudentMarksGT60(List ar)
     {
    	 for(Object obj:ar)
      	{
      		
      		if(obj instanceof Student3)
      		{
      		    //Student3 s =(Student3)obj;
      			if(((Student3)obj).getMarks()>70)
      			{
      				System.out.println(obj);
      			}
      		}
    	 
       }
     }
    	 static void StartNmeWithStudentMarksGT60(List ar)
    	 {
    		 for(Object obj:ar)
    		 {
    			 
    			 if(obj instanceof Student3)
    			 {
    				 Student3 s =(Student3)obj;
    				 if(s.getName().startsWith("S") && s.getMarks()>70  )
    				 {
    					 System.out.println(obj);
    				 }
    			 }
    			 
    		 }
   }
}
