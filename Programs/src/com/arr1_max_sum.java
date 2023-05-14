package com;

import java.util.Scanner;

public class arr1_max_sum {
	
	static int max(int arr[])
	{
		int m=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(m<arr[i])
			{
				m=arr[i];
			}
		}
		
		return m;
		
	}
   public static void main(String[] args) {
	  Scanner ip=new Scanner(System.in);
	  int size=ip.nextInt();
	  int sum=0;
	  int s[]=new int[size];
	  for(int i=0;i<s.length;i++)
	  {
		  s[i]=ip.nextInt();
	  }
	  int ma=max(s);
	  for(int i=0;i<s.length;i++)
	  {
		  if(ma!=s[i])
		  {
			  sum=sum+s[i];
		  }
	  }
	  if(sum==ma)
	  {
		  System.out.println("happy group");
	  }
	  else
	  {
		  System.err.println("not a happy group");
	  }
}
	
	
}
