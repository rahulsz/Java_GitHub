package cons;

public class emp {

	emp()
	{
		System.out.println("no arguments");
	}
	
	emp(int id)
	{ 
		System.out.println("employee id: "+id);
	}
	
	emp(int id ,String name)
	{
		System.out.println("employee id: "+id+" "+"employee name: "+name);
	}
	emp(int id ,String name,String location)
	{
		System.out.println("Employee id: "+id+" "+"Employee name: "+name+" Emplyoee Location "+location);
	}
	
	public static void main(String[] args) {
	   emp e1=new emp();
	   emp e2= new emp(123);
	   emp e3 = new emp(123,"Rahul");
	   emp e4= new emp(123,"Rahul","Athani");
	}
}
