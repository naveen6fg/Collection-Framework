import java.util.*;

public class ArrayListDemo
{
  public static void main(String[] args)
  {
	  List l=new ArrayList();
	  l.add("Hello");
	  l.add('A');
	  l.add(109l);
	  l.add(12.4f);
	  l.add(null);
	  l.add(276);
	  
	  System.out.println("Size of arrayList ="+l.size());
	  
	  List naya =new ArrayList();
	  
	  naya.add(232);
	  naya.add('p');
	  naya.add("World");
	  naya.add(232l);
	  naya.add(673f);
	  
	  l.retainAll(naya);
	  
	  System.out.println(l);
	  System.out.println(naya);
	  naya.remove(1);
	  naya.add(3,"Naveen");
	  
	  
	  naya.add(3,"Naveen");
	  System.out.println(naya);
	  
	  
	  
	  
  }
}
