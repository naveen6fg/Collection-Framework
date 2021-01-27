package assignment.collection;
import java.util.HashMap;
import java.util.Scanner;


public class WeatherApp 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Question19  q=new Question19(sc,new HashMap<String ,Integer>());
		for(;;)
		{
			System.out.println("1.Add\n2.Display\n3.Check City\n4.Remove City\n5.Update6.DisplayWeather\n7.DsplayName\n7.Exit\nEnter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:q.read();
						System.out.println();
						break;
				case 2:q.disp();
					System.out.println();
						break;
				case 3:q.checkCity();
           				System.out.println();
						break;
				case 4:q.deleteCity();
				System.out.println();
						break;
				case 5:q.update();
				System.out.println();
						break;
				case 6:q.dispWeather();
				System.out.println();
						break;
				case 7:q.dispName();
				System.out.println();
						break;
				default:System.exit(0);
			}
		}
	}
}
