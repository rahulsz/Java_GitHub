package array;

import java.util.Scanner;

public class maximum_n_minimum 
{
	static int max(int arr[])             
	{ int m=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>m)
		{
			m=arr[i];
			
		}
		
	}
	return m;
	}
	
	static int min(int arr[])
	{
		int n=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<n)
			{
				n=arr[i];
				
			}
		}
		return n;
	}
	
public static void main(String[] args)
{ 
	Scanner ip=new Scanner(System.in);
     int size=ip.nextInt();
     int s[]=new int[size];
     for(int i=0;i<s.length;i++)
     {
    	 s[i]=ip.nextInt();
     }
     System.out.println("maximum element in the array "+max(s));
     System.out.println("minimum element in the array "+min(s));
     
     System.out.println("Difference between Maximun and Minimum Element: "+(max(s)-min(s)));
     
     
     
	
}
}


