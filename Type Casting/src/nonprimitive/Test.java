package nonprimitive;

public class Test 
{ 
	public static void main(String[] args) {
		//UP CASTING
				Father f=new Son();
				System.out.println(f.age);//f.name will give Error
				
				//DOWN CASTING
				Son s=(Son) f;
				System.out.println(s.age+" "+s.name);
				
				//Son s= new Son();
				//Father f=s;
	}

}
