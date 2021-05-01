package training;
import java.util.*;
public class rarr
{
	public static void main(String[] args) 
	{ 
		rarr obj=new rarr();
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.getSorted(arr);
     }
     void getSorted(int arr[])
     {  
    	int n=arr.length;
     	for(int i=n-1;i>=0;i--)
     	{
     	System.out.println(arr[i]);
     	}
   	 }
 }    
