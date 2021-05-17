package training;
import java.util.*;
public class exceptions 
{
public static void main(String[] args) 
{
	
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
try{int c=a/b;
System.out.println(c);}
catch(ArithmeticException ref)
{
	System.out.println("Dont enter 0 for b");
}
finally 
{
	System.out.println("value of a="+a+"    value of b="+b);
}
}
}
