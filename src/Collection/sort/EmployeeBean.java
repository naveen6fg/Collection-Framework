package Collection.sort;

import java.util.*;
class EmployeeBean implements Comparator<EmployeeBean>
{
  private int eId;
   private String eName;
   private double eSal;
  
   
   public EmployeeBean(int eId, String eName, double eSal)
  {

	this.eId = eId;
	this.eName = eName;
	this.eSal = eSal;
  }
   public EmployeeBean()
   {
	
   }
   
    public int compare(EmployeeBean t1,EmployeeBean t2)
   {
	   int x= t1.eName.compareTo(t2.eName);
	   return x;
   }
    
   public String toString()
   {
	   return eId+"          "+eName+"          "+eSal;
   }
   
   public static void main(String[] args)
   {
	  List<EmployeeBean> l= new ArrayList<EmployeeBean>();
	  
	  l.add(new EmployeeBean(13,"Pankaj  ",77700.0));
	  l.add(new EmployeeBean(12,"Naveen  ",77709.0));
	  l.add(new EmployeeBean(10,"RamRat  " , 98000.0));
	  l.add(new EmployeeBean(11,"Kajal   ",18000.0));
	  l.add(new EmployeeBean(15,"Somaya  ",30000.0));
   
      //System.out.println(l);
      
      System.out.println("Before Sorting Name : ");
      System.out.println("-------------------------------------------");
      System.out.println("\nID\t\tNAME\t\tSAL");
      System.out.println("----------------------------------------------------");
      
      for(int i=0;i<l.size();i++)
      {
    	  System.out.println(l.get(i));
      }
      
      System.out.println();
      Collections.sort(l,new EmployeeBean());
      
      System.out.println("After Sorting Name ");
      System.out.println("-----------------------------------------------------");
      System.out.println("\nID\t\tNAME\t\tSAL");
      System.out.println("---------------------------------------------------------");
      for(int i=0;i<l.size();i++)
      {
    	  System.out.println(l.get(i));
      }
   }
   
   
}
