package Generalisation;

public class Solution 
{ 
	static void display(Employee emp)
	{
		if(emp instanceof Developer)
		{
			System.out.println("Down Casting ");
			Developer d=(Developer)emp;
			d.work();
		}
		else if(emp instanceof Tester)
		{
			System.out.println("Down Casting");
			Tester t=(Tester)emp;
			t.work();
		}
		
	}
	public static void main(String[] args) {
		display(new Developer());
		display(new Tester());
	}
  
}
