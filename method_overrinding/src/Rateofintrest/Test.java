package Rateofintrest;

public class Test 
{
 public static void main(String[] args)
{
SBI s=new SBI();
ICICI i=new ICICI();
AXIS a=new AXIS();
System.out.println("SBI rate of intrest: "+s.getRateOfIntrest());
System.out.println("ICICI rate of intrest: "+i.getRateOfIntrest());
System.out.println("AXIS rate of intrest: "+a.getRateOfIntrest());
}
}
