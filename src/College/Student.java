package College;

public class Student
{
   private int sno;
   private  String sname;
   private String course;
   private double fee;

   
   public Student(int sno, String sname, String course, double fee)
   {
	
	this.sno = sno;
	this.sname = sname;
	this.course = course;
	this.fee = fee;
  }
   
   public String toString()
   {
     return sno+"      "+sname+ "     "+course+ "     "+fee;
   }
   
  
   
}
