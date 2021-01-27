package Set;

import java.awt.Label;

public class Cyclic_roatate1
{
      public static void main(String[] args)
      {
    	
    	 
    	  String raw = "1233983543587325318";

    	  char[] list = new char[raw.length()];
    	  list = raw.toCharArray();
    	  int[] x1= new int[raw.length()];

    	  for (int i = 0; i < raw.length(); i++){
    	      x1[i] = (int)list[i]-'0';
    	  }

    	  //System.out.println(x1);
          
          int key=1;
          int temp;
          for (int i = 0; i < key; i++)
			{
			 
			  
			  for (int j = 0; j < x1.length-1; j++)
				{
				  
				 temp=x1[j];
				 x1[j] = x1[j + 1];
				 x1[j+1]=temp;
			    }

			  
		   }
		   for (int i = 0; i < x1.length; i++)
		   {
			  System.out.print(" "+x1[i]);
			
		   }
		    System.out.println();
	  }
}
