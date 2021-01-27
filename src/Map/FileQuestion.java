package Map;

import java.io.*;

import java.util.*;

public class FileQuestion
{
     public static void main(String[] args) throws IOException
     {
	     File f =new File("C:\\Users\\Roy\\Desktop\\Test.txt");
	    FileReader fr =new FileReader(f);
	    BufferedReader br =new BufferedReader(fr);
	    
	   
    	 
    	/*BufferedReader br =new BufferedReader(new FileReader(new File("C:\\Users\\Roy\\Desktop\\Test.txt")));
	    String line=null;
	    while((line = br.readLine()) != null)
	    {
	    	System.out.println(line);
	    }*/
    	
    	 
    	
	    
	    File myObj = new File("C:\\Users\\Roy\\Desktop\\Test.txt");
         Scanner myReader = new Scanner(myObj);
         while (myReader.hasNextLine())
         {
           String data = myReader.nextLine();
           System.out.println(data);
	  
         }
	    
	    
	   /* File file = new File("C:\\Users\\Roy\\Desktop\\Test.txt"); 
	    BufferedReader br = new BufferedReader(new FileReader(file)); 
	    String st; 
	    while ((st = br.readLine()) != null) 
	      System.out.println(st); */
	    } 
	 
	    
	 
}
