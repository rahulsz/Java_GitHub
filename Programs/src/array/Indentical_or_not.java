package array;

import java.util.Scanner;

public class Indentical_or_not
{
	static boolean indentical(int[]x,int[]y)
	{
		int c=0;
	   if(x.length==y.length)
	   {
		 for(int i=0;i<x.length;i++)	 
		 {
			 if(x[i]==y[i])
			 {
				 c++;
			 }
		 }
	      if(c==x.length) 
			 return true;
		 
		 else 
	     return false;
	 }
	 else 
		 return false;
	}
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Array 1 Size");
		int size1=ip.nextInt();
		int s1[]=new int[size1];
		System.out.println("Enter Array 1 Elements");
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=ip.nextInt();	
		}
		
		System.out.println("Enter Array 2 Size");
		int size2=ip.nextInt();
		int s2[]=new int[size2];
		System.out.println("Enter Array 2 Elements");
		for(int i=0;i<s2.length;i++)
		{
			s2[i]=ip.nextInt();
			
		}
		System.out.println(indentical(s1,s2)?" Indentical Arrays ":" Not Indentical Arrays ");
	}

}
