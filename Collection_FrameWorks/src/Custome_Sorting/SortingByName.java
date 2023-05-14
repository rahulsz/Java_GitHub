package Custome_Sorting;

import java.util.Comparator;

public class SortingByName implements Comparator<Student>
{
	public int compare(Student x,Student y)
	{
		return x.name.compareTo(y.name);
	}

}
