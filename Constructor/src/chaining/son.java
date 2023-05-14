package chaining;

class son extends father
{ 
	son(String name)
	{
		         // super() have to write is first otherwise we get error
	super(10);   // calling in different class with
	             //                   IS-A relation
		System.out.println("Name "+name);
	}
	

}
