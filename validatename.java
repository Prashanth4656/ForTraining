package training;
import java.util.*;
public class validatename 
{
public static void main(String[] args) throws myException
{
	Scanner sc=new Scanner(System.in);
	String firstName="",lastName="";
	System.out.println("Enter first name:");
	firstName=sc.nextLine();
	System.out.println("Eneter last name:");
	lastName=sc.nextLine();
     function(firstName,lastName);
}
public static void function(String firstName,String lastName)throws myException
{
	if(firstName.length()==0&&lastName.length()==0)
	{
		System.out.println("Enter both names ");
	    throw new myException(firstName);
    }
	else
	{
		System.out.println("Validated");
	}
String str=firstName.concat(lastName);
}
}
class myException extends Exception
{
myException(String str)
{
	super(str+"Atleast one name should be entered");
}
}

