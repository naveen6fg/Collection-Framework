package College;

public class Faculty
{
   private int fno;
   private String fname;
   private String fsubject;
   private double fsal;

   
 public Faculty(int fno, String fname, String fsubject, double fsal)
  {

	this.fno = fno;
	this.fname = fname;
	this.fsubject = fsubject;
	this.fsal = fsal;
  }
 
 @Override
 public String toString()
 {
	   return fno+"      "+fname+ "     "+fsubject+ "     "+fsal;
 }
}
