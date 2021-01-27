package Set;

public class Cyclic_Roatate
{
    public static void main(String[] args)
    {
    	 
        int x = 12345;
        System.out.println(x);
        String s=Integer.toString(x);  ///integer to String       (1-way)
        System.out.println(s);
        
        char[] a=s.toCharArray();    ///String to Char array
        System.out.println(a);
        
        
        
        String s2="12345";
        System.out.println(s2);
        int x2=Integer.parseInt(s2);  ///String to Integer
        System.out.println(x2);
        
        String s3=((Integer)x2).toString();   ///integer to string     (2-way)
        System.out.println(s3);
    }
}
