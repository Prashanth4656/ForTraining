package training;
import java.util.*;
public class threadtimer extends Thread
{
public static void main(String[] args) 
{
threadtimer obj=new threadtimer();
obj.start();
try
{
	for(int i=0;i<10000;i++)
{
	Thread.sleep(1000);
	System.out.print("\r"+i);
}
}
catch(InterruptedException hi)
{
	System.out.println("idk");
}

}

}
