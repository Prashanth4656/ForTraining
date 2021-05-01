package training;
import java.util.*;
public class sumofn 
{

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter value of n:");
     int n=sc.nextInt();
	 sumofn obj=new sumofn();
	 obj.calculateSum(n);
	}
    void calculateSum(int n)
    {   
    	Scanner pc=new Scanner(System.in);
    	int sum=0;
        for(int i=1;i<=n;i++)
        {
        if(i%3==0||i%5==0)
        {
        	sum=sum+i;
        }
        }
      System.out.println(sum);
    }
}
