package com;

import java.util.Scanner;

public class palindrome_number {
    static int palindrome(int n)
    { int rem=0,rev=0;
     
    for(int i=1;n!=0;i++)
    {
       rem=n%10;
       rev=(10*rev)+rem;
       n=n/10;
    
    }
    return rev;
    }
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int reversed=palindrome(n);
		if(n==reversed)
		{
			System.out.println("palindrome sequence");
		}
		else
		{
			System.err.println("not a palindrome");
		}
	}
}
