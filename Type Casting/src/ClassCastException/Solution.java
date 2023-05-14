package ClassCastException;

public class Solution 
{
 public static void main(String[] args) 
 {
	
	Father f=new Son();
	
	if(f instanceof Son)
	{System.out.println("Downcasting to son");
		Son s= (Son)f;
		System.out.println(s.x+" "+s.y);
	}
	else
	{System.out.println("Downcasting to Daughter");
		Daughter d=(Daughter)f;
		System.out.println(d.x+" "+d.z);

	}
	
	
	

}
}
