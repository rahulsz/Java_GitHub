package com;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=ip.nextInt();//10
		System.out.println("Enter the value of b:");
		int b=ip.nextInt();//0 
		try {
		System.out.println(a/b); //10/0 --> ArithmeticException
		
		}
		catch(ArithmeticException e)//specific Exception Handler
		{
			System.out.println("Don't divide by zero");
		}
		
		ip.close();
	}

}
