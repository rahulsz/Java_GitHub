package Sorting;

import java.util.Comparator;

public class SortingByProductId implements Comparator<Flipkart>{
	
	public int compare(Flipkart x,Flipkart y)
	{
		return x.product_id-y.product_id; //x.product_id.compareTo(y.product_id); // in this case we have declare variable with 
		                                                                       //           with help of Wrapper Class
		
	}

}
