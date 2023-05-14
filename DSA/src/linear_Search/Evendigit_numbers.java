package linear_Search;

public class Evendigit_numbers 
{
	public static void main(String[] args) {
		int[] arr = {12,895,89,1534};
		System.out.println(count(arr));
	}
	static int count(int []nums)
	{
		int count=0;
		for(int a : nums)
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
		String s="";
		int x=(s+a).length();
		if(x%2==0)
			return true;
		
		return false;
		
	}

}
