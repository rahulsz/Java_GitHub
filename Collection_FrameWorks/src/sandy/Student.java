package sandy;

public class Student implements Comparable<Student> {
	
	int age;
	
	Student(int age)
	{
		this.age=age;
	}
	
	public String toString()
	{
		return "Student_Age: "+age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}

}
