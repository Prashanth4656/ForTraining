package training;

import java.util.Scanner;

public class strsplit 
{
public static void main(String[] args) 
{
	Scanner sc =new Scanner(System.in);
	String str,d="";
	System.out.println("Enter String:");
	str=sc.nextLine();
	System.out.println("Enter the delimeter to break:");
	d=sc.nextLine();
	strsplit obj=new strsplit();
	obj.splitter(str,d);
}
void splitter(String str,String d)
{
	String str2="",str3=" ";
str2=str2+str.replace(d," ");
int i,j;
for(i=0;i<=str2.length();i++)
{
	if(str2.substring(i).startsWith(" ")||i==0)
	{
		for(j=i+1;j<=str2.length();j++)
		{
			if(str2.substring(j).startsWith(" ")||j==str2.length())
			{
				System.out.println(str2.substring(i,j));
				i=j;
			}
		}
	}
}
}

}