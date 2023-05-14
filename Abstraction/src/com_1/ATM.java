package com_1;

public class ATM implements Bank
{     int balance=5000;

	public void deposit(int amount)
	{
		System.out.println("Depositing Rs: "+amount);
		balance=balance+amount;
		System.out.println("Amount Deposited Successfully");
	}
	
	public void withdraw(int amount)
	{
		System.out.println("Withdrawing Rs: "+amount);
		if(amount>balance)
		{
			System.out.println("Insufficient Balance");
			
		}
		else
		{
			balance=balance-amount;
			System.out.println("Amount withdrawl Successfully");
		}
	
	}
	
	public void checkBalance()
	{
		System.out.println("Available Balance: Rs."+balance );
	}

	
	
}
