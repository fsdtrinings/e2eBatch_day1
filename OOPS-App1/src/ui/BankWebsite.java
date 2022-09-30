package ui;

import entity.Account;

public class BankWebsite {
	Account a;  // similar to int x
	int x; 
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	public void setAccountData()
	{
		/* all scanner code , which all knows it already*/
		
		String accountHolderName = "Ramesh Kumar "; // take it from scanner
		int accountNumber = 101;
		int balance = 2000;
		
		a = new Account(); // account which declared already.
		// similar to x = 10
		a.setAccountHolderName(accountHolderName);
		a.setAccountNumber(accountNumber);
		a.setBalance(balance);
	}
	
	public void checkBalance()
	{
		int currentBalance = a.getBalance();
		System.out.println(a.getAccountNumber()+" - "+currentBalance);
		
	}
	
	public void fundTransfer()
	{
		// some code 
		
	}
	
	public void deposit()
	{
		
	}
	
	


}
