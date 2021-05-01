package training;
import java.util.*;
public class ascarr
{
public static void main(String[] args)
{
ascarr obj=new ascarr();
Scanner sc=new Scanner(System.in);
System.out.println("Size of array:");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
obj.getSecondSmallest(arr);
}

void getSecondSmallest(int arr[])
{
	Arrays.sort(arr);
    System.out.println(arr[1]);
}
}
