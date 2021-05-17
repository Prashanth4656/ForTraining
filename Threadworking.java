package training;
public class Threadworking extends Thread
{
public static void main(String[] args) 
{
Threadworking asd=new Threadworking();
asd.start();
System.out.println(Thread.currentThread().getName()+"running...");
}
public void run()
{
	System.out.println(Thread.currentThread().getName()+"running...");
}
}
