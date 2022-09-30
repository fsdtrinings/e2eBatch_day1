package entity;

public class Account {

	private int accountNumber;
	private String accountHolderName;
	private int balance;
	private AccountDetails accountDetails;
	private RelationshipManager relationshipManager;
	

	
	public Account() {
		
	}
	
	/* only for previous code*/
	public Account(int accountNumber, String accountHolderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public Account(int accountNumber, String accountHolderName, int balance, AccountDetails accountDetails,
			RelationshipManager relationshipManager) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountDetails = accountDetails;
		this.relationshipManager = relationshipManager;
	}


	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}


	public AccountDetails getAccountDetails() {
		return accountDetails;
	}


	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}


	public RelationshipManager getRelationshipManager() {
		return relationshipManager;
	}


	public void setRelationshipManager(RelationshipManager relationshipManager) {
		this.relationshipManager = relationshipManager;
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + ", accountDetails=" + accountDetails + ", relationshipManager=" + relationshipManager + "]";
	}


	


	
	

	
	
	
}

















