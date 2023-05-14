package Generalization2;

public class Hotel 
{
	Food orderFood(int choice)
	{
		if(choice==1)
		{
			return new Idly();
			
		}
		
		else if(choice==2)
		{
			return  new Dosa();
			
		}
		else if(choice==3)
		{
			return new Vada();
			
		}
		else
			return null;
	}

}
