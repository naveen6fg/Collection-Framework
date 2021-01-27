package Collection.sort;

import java.util.*;

class MobileBean implements Comparator<MobileBean>
{
	String mName;
	String mColor;
	double mPrice;
	
	
	public MobileBean(String mName, String mColor, double mPrice)
	{
	
		this.mName = mName;
		this.mColor = mColor;
		this.mPrice = mPrice;
	}
	public MobileBean()
	{
		
	}
	
   public String toString()
   {
	   return mName+"       "+mColor+"      "+mPrice;
   }
   
   public int compare(MobileBean m1,MobileBean m2)
   {
	   return  ((Double)m2.mPrice).compareTo(m1.mPrice);
   }
	  
}


public class MobilePriceSort
{
   public static void main(String[] args)
   {
	  List<MobileBean> l= new ArrayList<MobileBean>() ;
	  
	  l.add(new MobileBean("GooglePixel", "DrakBlue",480000 ));
	  l.add(new MobileBean("iPhone 12  ", "Red     ",780000 ));
	  l.add(new MobileBean("One Plus   ", "Grey    ",380000 ));
	  l.add(new MobileBean("Asus       ", "Slety   ",420000 ));
	  
	 // System.out.println(l);
	  
	  System.out.println("Before Sorting Mob Price in DESC : ");
      System.out.println("--------------------------------------------");
      System.out.println("\nCOMPANY\t\tCOLOR\t\tPRICE");
      System.out.println("---------------------------------------------------");
      
      for(int i=0;i<l.size();i++)
      {
    	  System.out.println(l.get(i));
      }
      
      System.out.println();
      Collections.sort(l,new MobileBean());
      
      System.out.println("After Sorting Mob Price in DESC ");
      System.out.println("----------------------------------------------");
      System.out.println("\nCOMPANY\t\tCOLOR\t\tPRICE");
      System.out.println("--------------------------------------------");
      for(int i=0;i<l.size();i++)
      {
    	  System.out.println(l.get(i));
      }
   }
}
