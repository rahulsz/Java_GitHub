package array;

//import java.util.Arrays;

public class ranging 
{
  public static void main(String[] args) {
	int[] s= {1,3,23,9,18};
	System.out.println(maxRange(s,1,3));
	 
			
	}
  static int maxRange(int[]arr,int start,int end)
  {
	  int maxval=arr[start];
	  for(int i=start;i<end;i++)
	  {
		  if(arr[i]>maxval)
		  {
			  maxval=arr[i];
		  }
	  }
	  return maxval;
  }
  
}
