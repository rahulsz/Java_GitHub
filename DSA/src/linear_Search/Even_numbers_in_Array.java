package linear_Search;

public class Even_numbers_in_Array {
	public static void main(String[] args) {
		int [] arr= {2,8,7,9,6,8,66}; 
		System.out.println(evencount(arr));
	}
	static int evencount(int []arr)
	{
		int count=0;
	  for(int a: arr)
	  {
		  if(even(a))
		  {
			  count++;
		  }
	  }
	  return count;
	}

	static Boolean even(int a)
	{
		if(a%2==0)
			return true;
		
		return false;
	}
}
