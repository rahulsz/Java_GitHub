package Set;

public class Student implements Comparable<Student>
{
	int id;
	String name;
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return "id :"+id+" name: "+name;
	}
	
	public int compareTo(Student s)
	{
		return this.id-s.id;
	}
	

}
