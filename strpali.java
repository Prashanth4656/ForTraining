package training;

import java.util.*;

public class strpali 
{
public static void main(String[] args) 
{
	Scanner sc =new Scanner(System.in);
	String str,str2="";
	System.out.println("Enter String to be reversed:");
	str=sc.nextLine();
	for(int i=str.length()-1;i>=0;i--)
	{
		str2+=str.charAt(i);
	}
	if(str.equals(str2))
	{
		System.out.println("Yes its a palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}

}
}
