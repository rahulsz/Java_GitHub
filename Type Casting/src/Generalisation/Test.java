package Generalisation;

public class Test 
{ 
	static void display(Father f)
	{
		if(f instanceof Son)
		{
			System.out.println("Down Casting Son");
			Son s=(Son) f;
			System.out.println(s.x+" "+s.y);
		}
		else if(f instanceof Daughter)
		{
			System.out.println("Down Casting Daughter");
			Daughter d=(Daughter) f;
			System.out.println(d.x+" "+d.z);
		}
	}
	
	public static void main(String[] args) 
	{
		display(new Son());
		System.out.println("********");
		display(new Daughter());
		
	}

}
