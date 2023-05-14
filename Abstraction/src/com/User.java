package com;

import java.util.Scanner;

public class User 
{ public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	for(int i=1;;)
	{
        int n1=ip.nextInt();
        int n2=ip.nextInt();
        Calculator C=new Operations();
      //  C.add(n1, n2);
        C.multi(n1, n2);
      	
	}
	
}

}
