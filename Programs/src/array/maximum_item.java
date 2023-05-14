package array;

import java.util.Arrays;

public class maximum_item 
{ 
 public static void main(String[] args) {
	 int[] arr= { 1, 3, 23, 9, 18};
	 System.out.println(max(arr));
}
 static int max(int[] s)
 {
	int max=s[0]; 
	for(int i=0;i<s.length;i++)
	{
		if(max<s[i])
		{
			max=s[i];
			
		}
	}
	return max; 
	  
 }

}
