package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) 
	{
		
		Scanner ip=new Scanner(System.in);
		Student s=new Student();
		int n=ip.nextInt();
		
		s.setAge(n);
		System.out.println("Age is "+s.getAge());
        ip.close();
	}

}
