package day2b;

public class ServerCode {

	int allAccountBalance[]= {10000,2000,5000,6500,85200,35000};
	
	public boolean transferFunds(int ownerAccount,int payeeAccount , int amount)
	{
		boolean paymentStatus = false;
		boolean isOwnerValidated = validateAccount(ownerAccount, amount);
		
		if(isOwnerValidated)
		{
			allAccountBalance[ownerAccount] = allAccountBalance[ownerAccount]- amount;
			allAccountBalance[payeeAccount] = allAccountBalance[payeeAccount]+ amount;
			paymentStatus = true; // means t/f done
			return paymentStatus;
		}
		
		return paymentStatus;
	}
	
	public boolean validateAccount(int ownerAccount, int amount)
	{
		int actualBalance = allAccountBalance[ownerAccount];
		
		boolean isValidToTransfer = (actualBalance-amount>=5000) ? true : false;
		return isValidToTransfer;
	}
	
	public int[] getAllAccountArray()
	{
		
		return allAccountBalance ;
	}
	
	
}
