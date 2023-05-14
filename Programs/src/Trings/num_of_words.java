package Trings;

import java.util.Scanner;

public class num_of_words 
{ 
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		int sp=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				 sp++;
			}
		}
		System.out.println("Number of spacing in the given String: "+sp);
		System.out.println("Number of words in the given String: "+(sp+1));
		
	}

}
