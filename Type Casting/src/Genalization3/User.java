package Genalization3;

import java.util.Scanner;

public class User 
{
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		Flipkart F=new Flipkart();
		System.out.println("1:Order Laptop\n2:Order Mobile");
		int n=ip.nextInt();
		Electronics obj=F.ordering(n);
		if(obj instanceof Laptop)
		{
			System.out.println("Laptop Ordered");
		}
		
		if(obj instanceof Mobile)
		{
			System.out.println("Mobile Ordered");
		}


		
		
	}

}
