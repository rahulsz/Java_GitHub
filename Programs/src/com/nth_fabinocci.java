package com;

import java.util.Scanner;

public class nth_fabinocci {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int n1=0,n2=1,n3=0;
		
	//	System.out.print(n1+" "+n2);
		for(int i=3;i<=n;i++)
		{
			n3=n1+n2;
			//System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println(n3);
	}

}
