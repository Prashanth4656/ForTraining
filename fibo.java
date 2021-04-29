import java.util.*;
public class fibo
{
	public static void main(String[] args)
	 {
			
	int count=10,a=0,b=1,c;
	for(int i=1;i<=count;i++)
	{
      c=a+b;
      a=b;
      b=c;
      System.out.println(c);
	}
	}
}