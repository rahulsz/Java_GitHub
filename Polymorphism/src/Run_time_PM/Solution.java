package Run_time_PM;

public class Solution 
{
	static void display(Employee emp)
	{
		emp.work();
	}
	
	public static void main(String[] args) 
	{
		display(new Developer());
		display(new Tester());
		
		Employee e1=new Developer();
		e1.work();
		Employee e2=new Tester();
		e2.work();
	}

}
