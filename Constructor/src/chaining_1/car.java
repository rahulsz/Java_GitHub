package chaining_1;

class car
{
   car( int x)
   {this(12.09);    // this is calling car(double x)
	   System.out.println(1);  // 2nd execution
   }
	
   car(double x)
   {
	   System.out.println(2);  // 1st execution 
   }
	
	
}
