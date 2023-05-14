package Custome_Sorting;

import java.util.Comparator;

public class SortStudentsByAge implements Comparator<Student>
{
	public int compare(Student x,Student y)
	{
		return x.age-y.age;
	}
}
