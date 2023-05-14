package Generalization2;

public class Customer 
{
  public static void main(String[] args) {
	Hotel h=new Hotel();
	Food obj=h.orderFood(2);
	
	if(obj instanceof Idly)
	{
		System.out.println("Ordered Idly");
	}
	
	if(obj instanceof Dosa)
	{
		System.out.println("Ordered Dosa");
	}
	
	if(obj instanceof Vada)
	{
		System.out.println("Ordered Vada");
	}
}
}
