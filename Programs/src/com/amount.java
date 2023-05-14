package com;

import java.util.Scanner;

public class amount 
{
    public static void main(String[] args) 
    {   Scanner ip=new Scanner(System.in);
        int km=ip.nextInt();
		
		if(km<=2)
		{
			System.out.println("30 rs");
		}
		else if(km<=7)
		{
			System.out.println(30+(km-2)*20+"rs");
		}
		else if(km<=12)
		{
			System.out.println(130+(km-7)*25+"rs");
		}
		else
		{
			System.out.println(255+(km-12)+30+"rs");
		}
   }
}
