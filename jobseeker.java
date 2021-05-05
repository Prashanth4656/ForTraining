package training;

import java.util.Scanner;

public class jobseeker 
{

public static void main(String[] args) 
{
	String str;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Username:");
	str=sc.nextLine();
	if(function(str))
		System.out.println("true");
	else
		System.out.println("false");
}
static boolean function(String str)
{
if(str.endsWith("_job")&&str.length()>8)
{
	return true;
}
return false;
}
}

