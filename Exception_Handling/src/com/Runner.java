package com;

public class Runner 
{
	public static void main(String[] args) {
	try	{
		System.out.println(10/0);//new ArithmeticException();(object ofArithmeticException thrown);
		}
	catch(ArithmeticException e) //ArithmeticException e=new ArithmeticException();
	{
		System.out.println("Invalid Denominator");
	}
	
	}

}
