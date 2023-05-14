package Complie_time_PM;

public class Amazon 
{
	void purchase(int cost)
	{
		System.out.println("cost: "+cost);
	}
    
    void purchase(String product) 
    {
    	System.out.println("product name: "+product);
	}
     
    void purchase(int cost,String product) 
    {
    	System.out.println("cost: "+cost+" product: "+product);
	}
      
    void purchase(String product,int cost) 
    {
    	System.out.println("product: "+product+" cost: "+cost);
	}
}
