package Sorting;

public class Flipkart 
{
	int product_id;
	String product_name;
	
	Flipkart(int product_id,String product_name)
	{
		this.product_id=product_id;
		this.product_name=product_name;
	}
	
	public String toString()
	{
		return "Product_ID:"+product_id+" || Product_Name:"+product_name;
	}
}
