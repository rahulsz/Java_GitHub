package com;

import java.util.Scanner;

public class One_to_100 
{
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		 int x=ip.nextInt();
		 int m=0;
		for(int i=1;i<=n;i++)
		{  
		    int y=0;
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
			 m=i;
			  y++;
			}
			if(y==x)
			{
				System.out.println(m);
			}
			
			
		}
	}

}
