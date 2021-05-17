package training;
import java.util.*;
public class random extends Thread
{  
public static void main( String[]args)
{
random obj=new random();
obj.start();
Date d1=new Date();
try {
Thread.sleep(d1.getTime());
System.out.println(Thread.currentThread().getName());
}
catch(InterruptedException io)
{
	System.out.print("idk");
}
}  
}
  