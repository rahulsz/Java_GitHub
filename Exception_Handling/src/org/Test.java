package org;

public class Test {
  public static void main(String[] args) {
	  
	 try {
	  System.out.println(10/0);

	  }
	 catch(Exception e)
	 {
		
		 System.out.println(e.getMessage()); /*  / by zero /  */
	     String mesg=e.getMessage();
	     System.out.println(mesg);
	 }
	  }
}
 