package com;

import java.util.Scanner;

public class arr_max_min 
{
static int max(int arr[])
{  int m=arr[0];
	for(int i=0;i<arr.length;i++ )
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
			n=arr[i] ;
		 }
	 }
      return n;
 }
	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		int size=ip.nextInt();
		int s[]=new int[size];
		for(int i=0;i<s.length;i++)
		{
			s[i]=ip.nextInt();
		}
		int high=max(s);
		int low=min(s);
		System.out.print("max element in the array: "+high+" min element in the array: "+low);
	}


}

	
	

	

