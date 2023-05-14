package cons;

class constructor 
{
   int id;
   String name;
   long Salary;
   
   constructor(int id,String name,long Salary)
   {
	   this.id=id;
	   this.name=name;
	   this.Salary=Salary;
	   
   }
   void display()       // to avoid the redundancy   we are using this method
   {
	   System.out.println("Emplyoee ID: "+this.id);    //id;
	   System.out.println("Employee Name: "+this.name);   //name; 
	   System.out.println("Employee Salary: "+this.Salary);  //Salary
   }
   public static void main(String[] args)
   {
	constructor e1= new constructor(123,"rahul",1000000);
	constructor e2= new constructor(121,"rock",2000000);
	e1.display();
	e2.display();
	   
   }
   
   
   
}
