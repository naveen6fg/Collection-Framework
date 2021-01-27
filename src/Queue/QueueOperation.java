package Queue;

import java.util.*;

public class QueueOperation
{
  public static void main(String[] args)
  {
     Queue<Integer> q =new LinkedList<Integer>();
     
     q.add(3254);     //FIFO
     q.add(54);
     q.add(65);
     q.add(76);
     q.add(33);
     q.add(44);
   
    System.out.println(q);
       
    System.out.println(q.poll());    //Retrieve head queue element and remove it
    System.out.println(q.remove());   //Retrieve head queue element and remove it
    System.out.println(q);
    System.out.println(q.peek());   //display first inserted object
    
    System.out.println(q.offer(99));   

    System.out.println(q);
    
  }
}
