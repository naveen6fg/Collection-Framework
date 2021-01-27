package Map;

import java.util.*;
import java.util.Map.Entry;
public class CharacterInsertion
{
   public static void main(String[] args)
   {
	   Scanner sc =new Scanner(System.in);
	   
	   Map<Character,Integer> m = new HashMap<Character,Integer>();   
		 
	 	  char c='a';
		  for(int i=1;i<=26;i++)
		  {
		     	  m.put(c, i);
		     	  c++;
		     	  
		  }
		 
		 // System.out.println(m);
		  
		  System.out.println("Enter a sting to get their sum");
		  String s =sc.next();
		  
		  char[] ch=s.toCharArray();
		  
		  int sum=0;
		 
		  for(int i=0;i<s.length();i++)
		  {
   			//sum=sum+m.get(s.charAt(i));  
   			sum=sum+m.get(ch[i]);  
		  }
		  System.out.println(s+" = "+sum);
		 
   }
}
