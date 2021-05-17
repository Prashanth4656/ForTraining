package training;
import java.util.*;
public class AssertDemo 
{
public static void main(String[] args) 
{
System.out.println("Enter age:");
Scanner a=new Scanner(System.in);
int age=a.nextInt();
	assert(age>0&&age<45):"Not eligible age:"+age;
	System.out.println("You are eligible");
}
}
