package assignment.collection;
import java.util.*;
public class EmployeeApp 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Question18  q=new Question18(sc,new HashMap<Integer,String>());
		for(;;)
		{
			System.out.println("1.Add\n2.Display\n3.Check User\n4.Remove User\n5.DisplayNames6.DsplayId\n7.Exit\nEnter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:q.read();
						System.out.println();
						break;
				case 2:q.disp();
					System.out.println();
						break;
				case 3:q.checkUser();
           				System.out.println();
						break;
				case 4:q.deleteUser();
				System.out.println();
						break;
				case 5:q.dispName();
				System.out.println();
						break;
				case 6:q.dispId();
				System.out.println();
						break;
				default:System.exit(0);
			}
		
		}
	}
}
