package com;

public class Operations implements Calculator
{
	int ans=0;
	 @Override
	 public void add(int n1,int n2)
	 { 
		 System.out.println("adding");
		 int ans=n1+n2;
		 System.out.println("added"+ans);
	 }
	   @Override
		public void Sub(int n1, int n2) 
	   {
		
			System.out.println("Substracting");
			 int ans=n1-n2;
			 
		 }
	 
	 @Override
	 public void multi(int n1,int n2)
	 {

		 System.out.println("Multiplication");
		 int ans=n1*n2;
		 System.out.println("ans"+ans);
	 }
	 @Override
	 public void div(int n1,int n2)
	 {
	 System.out.println("divsion");
		 int ans=n1/n2;
		 
	 }


		
	}

