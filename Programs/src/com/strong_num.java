package com;

import java.util.Scanner;

public class strong_num {
	static int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner ip=new Scanner(System.in);
         int n=ip.nextInt();
         int temp=n,sum=0,rem=0;
         
         while(temp!=0)
         {
        	 rem=temp%10;
        	 sum=sum+fact(rem);
        	 temp=temp/10;
         }
         if(n==sum)
         {
        	 System.out.println("strong num");
         }
         else
         {
        	 System.err.println("not a strong num");
         }
	}

}
