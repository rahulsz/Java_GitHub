package Set;

import java.util.TreeSet;

public class Sorting_Students {
 public static void main(String[] args)
 {  
	Student s1=new Student(10,"Rahul");
	Student s2=new Student(9,"XXX");
	Student s3=new Student(8,"YYY");
	
	TreeSet<Student> t=new TreeSet<Student>();
	t.add(s1);
	t.add(s2);
	t.add(s3);
	
	for(Student s:t)
	{
		System.out.println(s);
	}
	
	
	
}
}
