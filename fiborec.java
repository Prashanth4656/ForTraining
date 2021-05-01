package training;
import java.util.*;
public class fiborec
{
int a=0,b=1,c=0;
public static void main(String[] args) 
{
int count;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n:");
count=sc.nextInt();
System.out.println("0");
System.out.println("1");
fiborec obj=new fiborec();
obj.fun(count);
}
void fun(int count)
{
	while(count>0)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		count--;
	}
}
}
