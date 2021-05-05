package training;
import java.util.*;
public class sumofintstring 
{
public static void main(String[] args) 
{
	Scanner sc =new Scanner(System.in);
	String str;
	System.out.println("Enter String of integers separated by ',':");
	str=sc.nextLine();
	int sum=0;
	String [] arrofstr=str.split(",");
	for(String a:arrofstr) 
		System.out.println(a);
for(int i=0;i<arrofstr.length;i++)
{
	int b=Integer.parseInt(arrofstr[i]);
	sum=sum+b;
}
System.out.println(sum);
}
}