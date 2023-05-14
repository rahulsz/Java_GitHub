package Binary_Search;

import java.util.Scanner;

public class binarySearch {
	public static void main(String[] args) {
		Scanner ip =new Scanner (System.in);
		int size = ip.nextInt();
		int [] arr = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int target=ip.nextInt();
		System.out.println(binarySearch(arr,target));
	}
	static int binarySearch(int[]arr,int target)
	{
		int start=0;
		int end = arr.length-1;
		
		while(start <= end)
		{
			int mid = start + (end+start)/2;
			if(target > arr[mid])
			{
				start = mid +1;
			}
			else if(target < arr[mid])
			{
				end = mid -1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
		
	}
}
