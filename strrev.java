package training;
import java.util.*;
public class strrev 
{

public static void main(String[] args) 
{
Scanner sc =new Scanner(System.in);
String str;
System.out.println("Enter String to be reversed:");
str=sc.nextLine();
for(int i=str.length();i>0;i--)
System.out.print(str.charAt(i-1));

}

}
