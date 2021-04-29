import java.util.*;
public class factorial
{
	public static void main(String[] args)
	 {
	 	int a,i,b=1;
	 	System.out.println("Enter number:");
	 	Scanner s=new Scanner(System.in);
        a=s.nextInt();
        for(i=1;i<=a;i++)
        {
        	 b=b*i;
		}
        System.out.println(b);
	}
}