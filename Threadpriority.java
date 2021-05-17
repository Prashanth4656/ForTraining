package training;
class ThreadPriority
{
public static void main(String[] args) 
{
torun obj= new torun();
Thread first = new Thread(obj);
Thread second = new Thread(obj);
Thread third = new Thread(obj);

first.setName("assdf");
second.setName(";lkj");
third.setName("qwerty");


first.setPriority(Thread.MIN_PRIORITY);
second.setPriority(Thread.NORM_PRIORITY);
third.setPriority(Thread.MAX_PRIORITY);


first.start();
second.start();
third.start();
}
}

class torun implements Runnable
{
@Override
public void run()
{
System.out.println(Thread.currentThread());
}
}