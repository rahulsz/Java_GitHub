package org;

public class FinallyBlockExample {
 public static void main(String[] args) {
	try
	{
		System.out.println(10/0);
	}
	catch(Exception e)
	{
		System.out.println("Invalid");
	}
	finally
	{
		System.out.println("Inside Finally Block");
	}
}
}
