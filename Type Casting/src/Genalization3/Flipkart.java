package Genalization3;

public class Flipkart 
{
	Electronics ordering(int choice)
	{
		if(choice==1)
			return new Laptop();
		else if(choice==2)
			return new Mobile();
		else
			return null;
		
	}

}
