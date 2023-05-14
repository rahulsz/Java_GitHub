package com;

public class test {

	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		p1.setAge(21);
		p1.setName("Rahul");
		p1.setJob("Developer");
		
		System.out.println("Age of the Person is "+p1.getAge()+" and his name is "+p1.getName()+" and he is a "+p1.getJob());
		
	}

}
