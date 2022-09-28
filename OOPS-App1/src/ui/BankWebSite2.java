package ui;

import java.util.Scanner;

import entity.Account;

public class BankWebSite2 {
	
	Account allAccounts[] = new Account[50000];
	int noOfAccountEntry = 0; // count of account
	
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		BankWebSite2 bankApp = new BankWebSite2();
		
		while(true)
		{
			System.out.println("\n\n\n\n ===== WebSite links (actions what user can do) ==== ");
			System.out.println("1. create Account. ");
			System.out.println("2. Display All Account ");
			System.out.println("3. Display Account based on ID ");
			System.out.println("4. Check Balance by Account Number ");
			System.out.println("5. Fund Transfer ");
			System.out.println("6. Deposit Amount ");
			System.out.println("7. Withdrawl Amount ");
			System.out.println("0. EXIT");
			
			System.out.println(" Enter option [0-7] :- ");
			
			switch (new Scanner(System.in).nextInt()) {
			
			case 0:
				System.exit(0);
				break;

			case 1:
				bankApp.createAccount();
				break;
				
			case 2:
				bankApp.displayAllAccounts();
				break;
			
			case 3:
				//bankApp.displayAccountBasedOnId();
				break;
			
			case 4:
				bankApp.checkBalance();
				break;
			
			case 5:
				bankApp.fundTransfer();
				break;
				
				
				
			default:
				System.out.println("Invalid Option ...");
			} //end switch
			
		}//end of while
		
	}//end of main
	
	public void printAccountDetails(Account a)
	{
		System.out.print("\n"+a.getAccountNumber()+"\t");
		System.out.print(a.getAccountHolderName()+"\t");
		System.out.print(a.getBalance()+"\t");
		System.out.println("\n---------------------------------------------\n");

	}
	
	
	public void displayAllAccounts() {
		
		for(int i = 0;i< noOfAccountEntry ;i++)
		{
			Account a = allAccounts[i];
			printAccountDetails(a);
		}
	}

	public void createAccount()
	{
		// take user input and set in the array 
		
		System.out.println(" Enter Account Number ");
		int accNumber = sc.nextInt();
		
		System.out.println(" Enter Account Holder Name :- ");
		String accHolderName = scStr.nextLine();
		
		System.out.println(" Enter Account Initial Balance:- ");
		int balance = sc.nextInt();
		
		allAccounts[noOfAccountEntry++] = new Account(accNumber, accHolderName, balance);
	
		
	}
	
	public void checkBalance()
	{
		// take user input as account number and render account balance;
		System.out.println(" Enter Account Number to check Balance ");
		int searchAccountNumber = sc.nextInt(); // 103
		
		boolean accountFound = false;
		
		for(int i = 0;i< noOfAccountEntry ;i++)
		{
			Account a = allAccounts[i];
			
			if(a.getAccountNumber() == searchAccountNumber)
			{
				System.out.println(" Current Balance :- "+a.getBalance()+" \n ");
				accountFound = true;
				break;
			}
			
		}
		
		if(accountFound == false)
		{
			System.out.println(searchAccountNumber+" is Inavlid account number ");
		}

		
	}

	public void fundTransfer()
	{
		// take user input such as account id , payeeId & amount 
		System.out.println("\n ======== Fund Transfer Use Case ==============\n");
		
		System.out.println(" Enter Account Owner Number ");
		int accNumber = sc.nextInt();
		
		System.out.println(" Enter Payee Account Number ");
		int payeeAccNumber = sc.nextInt();
		
		System.out.println(" Enter Amount to be Transfered :-  ");
		int amount  = sc.nextInt();
		
		
		Account ownerAccount = null;
		boolean foundOwnerAccount = false;
		Account payeeAccount = null;
		boolean foundPayeeAccount = false;
		
		for(int i = 0;i< noOfAccountEntry ;i++)
		{
			Account a = allAccounts[i];
			if(a.getAccountNumber() == accNumber)
			{
				ownerAccount = a;
				foundOwnerAccount = true;
			}
			if(a.getAccountNumber() == payeeAccNumber)
			{
				payeeAccount = a;
				foundPayeeAccount = true;
			}
			
			if(foundOwnerAccount && foundPayeeAccount)
			{
				break; // no need to iterate loop further as we got both accounts
				// otherwise , it slow down the application
			}
			
		}
		
		if(foundOwnerAccount && foundPayeeAccount)
		{
			ownerAccount.setBalance(ownerAccount.getBalance()-amount);
			payeeAccount.setBalance(payeeAccount.getBalance()+amount);
			
			System.out.println(" Fund Transfer Done ");
			System.out.println(" Cheack Balance ");
			System.out.println(ownerAccount.getAccountNumber()+" - "+ownerAccount.getBalance());
			System.out.println(payeeAccount.getAccountNumber()+" - "+payeeAccount.getBalance());
			
		}
		
		
		
	}
	
}//end class











