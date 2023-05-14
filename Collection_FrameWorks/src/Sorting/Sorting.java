package Sorting;

import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) 
	{
		SortingByProductId id=new SortingByProductId();
		Sorting_By_Name name=new Sorting_By_Name();
		TreeSet<Flipkart> t=new TreeSet<Flipkart>(name);
		t.add(new Flipkart(10,"B"));
		t.add(new Flipkart(9,"A"));
		t.add(new Flipkart(7,"C"));
		t.add(new Flipkart(8,"E"));
		t.add(new Flipkart(6,"D"));
		t.add(new Flipkart(4,"F"));
		t.add(new Flipkart(5,"H"));
		t.add(new Flipkart(2,"G"));
		t.add(new Flipkart(3,"J"));
		t.add(new Flipkart(1,"I"));
		
		for(Flipkart F:t)
		{
			System.out.println(F);
		}
		
		
		
		

	}

}
