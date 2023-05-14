package com;

import java.util.Scanner;

public class armstrong_num {
	static boolean amstr(int n)
	{
		int temp=n, c=0,sum=0,rem=0;
		
		while(temp!=0)
		{
			temp=temp/10;
			c++;
		}
		
		temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			int power=1;
			for(int i=1;i<=c;i++)
			{
				power=power*rem;
			}
			
			sum=sum+power;
			temp=temp/10;
			System.out.println(sum);
		}
		
		if(sum==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int x=ip.nextInt();
		System.out.println(amstr(x)?"amstrong number":"not a armstrong number");
	}
}

