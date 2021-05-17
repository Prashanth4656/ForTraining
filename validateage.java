package training;
import java.util.*;
public class validateage
{
public static void main(String[] args) throws myException2
{
	Scanner sc=new Scanner(System.in);
	int age;
	System.out.println("Eneter age:");
	age=sc.nextInt();
     function(age);
}
public static void function(int age)throws myException2
{
	if(age<15)
	{
		System.out.println("Age should be above 15");
	    throw new myException2(age);
    }
	else 
		System.out.println("Validated");
}
}
class myException2 extends Exception
{
myException2(int age)
{
	super("Age of person should be above 15");
}
}