package training;

public class Strings
{
public static void main(String[] args)
{
String str="Strings ";	
str+="for Training";
System.out.println(str);
str=str.concat("     !");
str=str.toUpperCase();
System.out.println(str);
str=str.toLowerCase();
System.out.println(str);
int a=str.length();
System.out.println(a);
int b=str.indexOf("for");
System.out.println(b);
str=str.replace(" ",",");
System.out.println(str);

}
}
