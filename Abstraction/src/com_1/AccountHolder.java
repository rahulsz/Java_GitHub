package com_1;

public class AccountHolder {
 public static void main(String[] args) {
	Bank A=new ATM();
	A.checkBalance();
	
	A.deposit(1000);
	
	A.checkBalance();
}
}
