package chaining_1;

 class bike extends car
{
  bike(String n)
  {    super(10);   // this calling car(int x)
	  
	  System.out.println(3); // 3rd execution
  }
  
  bike()
  {
	  this("rahul"); // this is calling bike(String n)
	  System.out.println(4);  // 4th execution
  }
}
