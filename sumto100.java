import java.util.*;
public class sumto100
{

     public static void main(String []args)
     {
        int count=100,sum,a=0,i;
        for(i=1;i<=count;i++)
        {  
        sum=a+i;
        a=sum;
        System.out.println(sum);
        }
    }
}