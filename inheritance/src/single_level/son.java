package single_level;

public class son extends father 
{
  int age=30;
  
  void display()
  {
	  int age=10;
	  System.out.println(age);
	  System.out.println(this.age);
	  System.out.println(super.age);
  }
}
