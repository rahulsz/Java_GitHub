package Set;

import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
	Integer id;
	String name;
	double Salary;
	
	Employee(int id,String name,double Salary)
	{
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	
	public String toString()
	{
		return "id:"+id+" name:"+name+" Salary: "+Salary;
	}
	
	public int compareTo(Employee e)
	{
		return this.id.compareTo(e.id);
		//return this.salary.compareTo(e.Salary);
	}
	
}
public class Sorting_Employee 
{
	public static void main(String[] args) {
		Employee e1=new Employee(7,"C",85.96);
		Employee e2=new Employee(6,"B",89.63);
		Employee e3=new Employee(5,"A",85.63);
		
		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee e:t)
		{
			System.out.println(e);
		}
		
	}

}
