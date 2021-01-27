package List;


import java.util.*;

public class ListOperation
{
    public static void main(String[] args)
    {
    	//List<Integer> l =new ArrayList<>();	
    	//List<Integer> l =new LinkedList()<>();	
    	 //Stack<Integer> l =new Stack<Integer>();
    	List<Integer> l =new Vector<Integer>(); //"Vector" is similar to "Arraylist" ony key difference is Vector class all methods are synchronized ,Vector is a legacy class.
    	
    	l.add(11);
    	l.add(34);
    	l.add(234);
    	l.add(543);
    	l.add(98);
    	l.add(753);
    	l.add(753);    //duplicate
    	l.add(45);
    	l.add(156);
    	l.add(12);
    	l.add(56);
    	
    	 /*l.push(46);     //LIFO    only for stack
    	 l.push(98);
    	 l.push(87);
    	 l.push(12);
    	 l.push(98);
    	 l.push(38);
    	 l.push(378);*/
    	
    	System.out.println(l);
    	
    	//System.out.println(l.peek());  //display last inserted element
    	
    	//System.out.println(l);
	}
}
