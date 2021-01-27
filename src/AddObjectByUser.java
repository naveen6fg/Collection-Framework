import java.util.*;

public class AddObjectByUser
{
    public static void main(String[] args)
    {
    	List l =new ArrayList();
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter total no of elements want to insert=");
	    int num=sc.nextInt();
	    
	    while(num>0)
	     {
	    	 l.add(sc.nextInt());
	    	 num--;
	     }
	     System.out.println(l);
    }
}
