package Trings;

import java.util.Scanner;

public class unique_element
{  
	static boolean unique(String n,char key)
	{ int c=0; int f=0; int count=0;
	  
	 
	for(int i=0;i<n.length();i++)
	{ 
		if(key==n.charAt(i))
		{  c++;
			f=i;
		}
	}
	if(c==0)
		return false;
	
	for(int i=1;i<=f;i++)
	{
		if(f%i==0)
		{
			count++;
		}
	}
	if(c==2)
		return true;
	else
		return false;
	
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		char k=ip.next().charAt(0);
		System.out.println(unique(s,k)?"Unique":"Not Unique");
	}
	

}
