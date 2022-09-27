package day2b;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UserIneration {

	ServerCode server = new ServerCode();
	public static void main(String[] args) {
		UserIneration bankingApp = new UserIneration();
		
		bankingApp.viewAllBalance();
		bankingApp.initiateFundTransfer(); // bank executive
		bankingApp.viewAllBalance();
		
		
	}
	public void viewAllBalance() {
		
		int allData[] = server.getAllAccountArray();
		
		System.out.println("\nAcc.no \t Balance\n=====================\n");
		for(int x = 0; x< allData.length ; x++)
		{
			System.out.println(x+" \t- "+allData[x]);
		}
	}
	
	public void initiateFundTransfer()
	{
		// need to take user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Ower Id [0-5]");
		int accountHolderId = sc.nextInt();
		
		System.out.println("Enter Payee Id [0-5]");
		int payeeId = sc.nextInt();
		
		System.out.println("Enter Amount to be transfered :- ");
		int amount = sc.nextInt();
		
		
		
		boolean statusNotification = server.transferFunds(accountHolderId, payeeId, amount);
		
		if(statusNotification)
		{
			System.out.println("Fund Transfer Done Rs."+amount+" Date/Time :- "+LocalDateTime.now());
		}
		else
		{
			System.out.println(" Fund transfer deny , reason low balance or connect to support@abc.com");
		}

	}
	
	public void printAccountBasedOnBalance()
	{
		// print account based on two balance range 
		
	}
	
	public void checkBalance()
	{
		/* user like to view balance*/
	}
	
	
}











