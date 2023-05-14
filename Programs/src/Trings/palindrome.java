package Trings;

import java.util.Scanner;

public class palindrome 
{
 public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	String S=ip.nextLine();
	String S1="";
	for(int i=S.length()-1;i>=0;i--)
	{
		S1=S1+S.charAt(i);
	}
	if(S.equals(S1))
	{
		System.out.println("Palindrome String");
	}
	else
	{
		System.err.println("Not a Palindrome String");
	}

 }
}
