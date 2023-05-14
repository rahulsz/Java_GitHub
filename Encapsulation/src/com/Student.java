package com;

public class Student 
{
  private int age;
  
  public void setAge(int age)
  {
	  if(age>0)
	  {
		  this.age=age;
		  System.out.println("Age is Initialized");
	  }
	  else
	  {
		  System.err.println("Age is not Initialtion");
	  }
  }
  public int getAge()
  {
	  return age;
  }
 
}