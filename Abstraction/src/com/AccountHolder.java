package com;

public class AccountHolder 
{ 
	public static void main(String[] args) {
		Bank B=new Atm();
		B.deposit(1000);
		System.out.println("***************");
		B.withdraw(2000);
		System.out.println("***************");
		B.checkbalance();
	}

}
