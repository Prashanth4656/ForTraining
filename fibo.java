package training;
import java.util.*;
public class fibo
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int count=sc.nextInt();
	    int a=0,b=1,c;
	    for(int i=1;i<=count;i++)
	    {
        c=a+b;
        a=b;
        b=c;
        System.out.println(c);
	    }
	}
}