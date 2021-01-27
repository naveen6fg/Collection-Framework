package College;

public class TestNeedForCollection
{
     public static void main(String[] args)
     {
		Student s1 =new Student(11,"Naveen","  BCA",         200000.00);
		Student s2 =new Student(12,"Ramratan","BCA",         600000.00);
		Student s3 =new Student(13,"Ratnesh"," B_Tech",      700000.00);
		Student s4 =new Student(14,"Angesh","  Polytech",    510000.00);
		Student s5 =new Student(15,"Aditya","  B-Tech",      500000.00);
	 
 
		
		Faculty f1 =new Faculty(22,"ManjuNath","PG" ,18000.00);
		Faculty f2 =new Faculty(23,"Imtiyaz","PG" ,18000.00);
		Faculty f3 =new Faculty(24,"Shubham","PG" ,18000.00);
		Faculty f4 =new Faculty(25,"ManjuNath","PG" ,18000.00);
		Faculty f5 =new Faculty(26,"PK","PG" ,18000.00);
		


//	     System.out.println(s1);
//       System.out.println(s2);
//       System.out.println(s3);
//       System.out.println(s4);
//       System.out.println(s5);
      
       System.out.println();

		
       College2ByCollection c =new College2ByCollection();
		c.join(s1);
		c.join(s2);
		c.join(s3);
		c.join(s4);
		c.join(s5);
		                                     //these both different type of data storing in a single that 
		                                       // is not good programming practise
		System.out.println();                // we should suppose to store in two different collection for two 
		c.join(f1);                           //different type of data
		c.join(f2);                         // in this case we use Generic (Angular Bracket<>)
		c.join(f3);
		c.join(f4);
		c.join(f5);
		
	    c.displayStudent();
	    c.displayFaculty();
	   
	   
	      }
     
}
