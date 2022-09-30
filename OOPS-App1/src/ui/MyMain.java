package ui;

import entity.Account;
import entity.AccountDetails;
import entity.RelationshipManager;

public class MyMain {

	public static void main(String[] args) {
		
		AccountDetails ad101 = new AccountDetails("ABC-123", "New Delhi", "ramesh@gmail.com", 969696969, "vhgvh323", "15154845");
		RelationshipManager rm = new RelationshipManager(700, "Deepal","Deepak@icici",74747474);
		
		Account a101 = new Account(101, "Ramesh", 2000, ad101, rm);
		
		System.out.println(a101);
		
		
	}
	
	
	
}
