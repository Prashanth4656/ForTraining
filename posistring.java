package training;
import java.util.*;
public class posistring 
{
public static void main(String[] args)
{
	String str;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter String:");
	str=sc.nextLine();
	if(function(str))
		System.out.println("true");
	else
		System.out.println("false");
	
	
}
static boolean function(String str)
{
	int n=str.length();
	char []arr=new char[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=str.charAt(i);
	}
	Arrays.sort(arr);
	for(int i=0;i<n;i++)
	{
		if(arr[i]!=str.charAt(i))
			return false;
	}
	return true;
}
}
