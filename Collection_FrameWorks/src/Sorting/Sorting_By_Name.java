package Sorting;

import java.util.Comparator;

public class Sorting_By_Name implements Comparator<Flipkart>
{
   public int compare(Flipkart x,Flipkart y)
   {
	   return x.product_name.compareTo(y.product_name);
   }
	 
}
