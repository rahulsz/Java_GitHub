package com;

import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		 int x=0;
		for(int i=2;i<=n;i++)
		{   int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
				
			}
			if(c==2)
			{ x=i;
			System.out.println(x);
			}	
		}
	//	System.out.println(x);
		
		
	}

}
