package array;

import java.util.Arrays;

public class reverse_the_array 
{
 public static void main(String[] args) {
	int[] arr= {1,3,23,9,18};
	 reverse(arr);
	  System.out.println(Arrays.toString(arr));
}
 static void reverse(int[]arr)
 {
	 int start=0;
	 int end =arr.length-1;
	 while(start<end)
	 {
		 //swap
		 swap(arr,start,end);
		 start++;
		 end--;
	 }  
 }
 static void swap(int[]arr,int n1,int n2)
 {
	 int temp=arr[n1];
	 arr[n1]=arr[n2];
	 arr[n2]=temp;
 }
}
