package com;

public class Atm implements Bank
{
  int balance=10000;
  @Override
  public void deposit(int amount)
  {
	  System.out.println("amount deposited "+amount);
	  balance=balance+amount;
	  System.out.println("Amount deposited");
	  
  }
  @Override
  public void withdraw(int amount)
  {
	  System.out.println("amount withdraw "+amount);
	  balance=balance-amount;
	  System.out.println("Amount deposited");
	  
  }
@Override
public void checkbalance() {
	System.out.println("Balance "+balance);
	
}
}
