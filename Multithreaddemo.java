package training;
class Multithreaddemo extends Thread
{
public static void main(String[] args) 
{
		Multithreaddemo qwe=new Multithreaddemo();
		Multithreaddemo asd=new Multithreaddemo();
	
		qwe.setName("asdf");
	    asd.setName(";lkj");

		qwe.start();
		asd.start();

	}


public void run(){
for(int count = 1; count < 4; count++)
{
System.out.println(Thread.currentThread().getName() + ", count : " + count);
}
}
}