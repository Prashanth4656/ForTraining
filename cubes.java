package training;
import java.util.*;
public class cubes 
{

	public static void main(String[] args) 
	{   int sum=0,x,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		while(n>0)
		{
			x=n%10;
			sum=sum+(x*x*x);
			n=n/10;
		}
	    System.out.println(sum);
	 }	
}
