package Custome_Sorting;

import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	SortStudentsByAge age=new SortStudentsByAge();
		SortingByName name=new SortingByName();
       TreeSet<Student> t=new TreeSet<Student>(name);

       t.add(new Student(10,"Rahul"));
       t.add(new Student(14,"XXX"));
       t.add(new Student(12,"HHH"));
	

	for(Student std:t)
	{
		System.out.println(std);
	}
}
}