package name;

import java.util.Scanner;

public class greatestofthree {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();
		String s = ""+a;
		for(int i = s.length()-1;i>=0 ;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
