package array;

import java.util.Scanner;

public class without_max
{ static boolean not_max_sum(int []arr)
	{ int m=arr[0],sum=0;
	 for(int i=0;i<arr.length;i++)
	 {
		 if(m<arr[i])
		 {
			 m=arr[i];
		 }
	 }
	 for(int i=0;i<arr.length;i++ )
	 {
		 if(m!=arr[i])
		 {
			 sum=sum+arr[i];
		 }
	 }
	  
	 if(m==sum)
		 return true;
	 else
		 return false;
	}

  public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter the Size of Array");
	int size=ip.nextInt();
	int s[]=new int[size];
	System.out.println("Enter the Elements of Array");
	for(int i=0;i<s.length;i++)
	{
		s[i]=ip.nextInt();
	}
	System.out.println(not_max_sum(s)?"Happy Group":"Not a Happy Group");
}
}
