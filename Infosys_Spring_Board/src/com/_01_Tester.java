package com;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;

public class _01_Tester {
	public static void main(String[] args) {
		String [] namesArray = {"alpha","bravo","charlie","delta","bravo","delta"};
		List<String> namesList= new LinkedList<String>();
		for(int index =0 ; index < namesArray.length;index++)
		{
			if(index %2==0)
			{
				namesList.add(0,namesArray[index]);
				
			}
			else
			{
				namesList.add(1,namesArray[index]);
			}
		}
		
		Set<String> nameSet = new LinkedHashSet()<String>(namesList);
		Iterator<String> setIterator = namesList.iterator();
		while(setIterator.hasNext())
		{
			if(setIterator.next().length()%5!=0)
			{
				setIterator.remove();
			}
		}
		System.out.println(nameSet);
	}

}
