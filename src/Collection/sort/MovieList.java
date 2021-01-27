package Collection.sort;

import java.util.*;

public class MovieList
{
    public static void main(String[] args)
    {
	   List<Movie>	l =new ArrayList<Movie>();
	   
	   l.add(new Movie("Hotel Transenveniya", 226));
	   l.add(new Movie("Alpha              ", 558));
	   l.add(new Movie("Paccaso            ", 226));
	   l.add(new Movie("Jack And Jill      ", 397));
	   l.add(new Movie("Mr. Robot          ", 226));
	   l.add(new Movie("Mandalorian        ", 226));
	   l.add(new Movie("Black Mirror       ", 226));
	   l.add(new Movie("Moana              ", 226));
	   l.add(new Movie("Nimo               ", 226));
	   
	   
	   System.out.println("Before Sorting  in DESC : ");
	      System.out.println("--------------------------------------------");
	      System.out.println("\nMOVIE NAMEt\tPRICE");
	      System.out.println("---------------------------------------------------");
	      
	      for(int i=0;i<l.size();i++)
	      {
	    	  System.out.println(l.get(i));
	      }
	      
	      System.out.println();
	      Collections.sort(l,new Movie());
	      
	      System.out.println("After Sorting in DESC ");
	      System.out.println("----------------------------------------------");
	      System.out.println("\nMOVIE NAMEt\tPRICE");
	      System.out.println("--------------------------------------------");
	      for(int i=0;i<l.size();i++)
	      {
	    	  System.out.println(l.get(i));
	      }
	}
}
