package Complie_time_PM;

public class Test 
{
   public static void main(String[] args) {
	Amazon obj=new Amazon();
	obj.purchase(4000);
	obj.purchase("Redmi");
	obj.purchase(4000, "Redmi");
	obj.purchase("Redmi", 4000);
}
}
