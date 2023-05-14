package chaining;

class demo 
{
  demo()
  { this(10);              // within the same for calling constructor we use [ this()] this calling statement.
	 System.out.println(1); 
  }
  
 
  demo(int x)
   {
	  System.out.println(2); 
   
   }
	public static void main(String[] args) {
		demo m=new demo();  // 2 
		                    // 1 output
	}
	
}
