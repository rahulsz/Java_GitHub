package com;

public class Example {
  public static void main(String[] args) {
	try
	{
		System.out.println(10/0);//new ArithmeticException();
	}
	//between try and catch block cannot have executable lines of code.
	catch(ArithmeticException e)  // we have use suitable try and catch block
	{
		System.out.println("Invalid Denominator");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Invalid Index");
	} 
	// super class Exception always going to be last catch block member
	catch(Exception e)// Exception e=new ArithmeticException();  (up-casting)-->Generalization
	{
		System.out.println("Invalid Denominator"); // super class Exception
		
	}
}
}
