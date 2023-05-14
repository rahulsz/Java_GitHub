package sandy;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		TreeSet <Student> t=new TreeSet<Student>();
		t.add(new Student(50));
		t.add(new Student(100));
		t.add(new Student(150));

		for(Student std:t ) {
		System.out.println(std);
		}

	}

}
