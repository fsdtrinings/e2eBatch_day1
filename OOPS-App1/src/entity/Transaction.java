package entity;

import java.time.LocalDateTime;

public class Transaction {

	private int tcode;
	private LocalDateTime dateTime;
	private int ownerAccountId;
	private int amount;
	private String type; // can be like deposit , withdrwal , fundTransfer , billPayment 
	private int payeeAccount = 0; // optional
	private String remarks;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int tcode, LocalDateTime dateTime, int ownerAccountId, int amount, String type, int payeeAccount,
			String remarks) {
		super();
		this.tcode = tcode;
		this.dateTime = dateTime;
		this.ownerAccountId = ownerAccountId;
		this.amount = amount;
		this.type = type;
		this.payeeAccount = payeeAccount;
		this.remarks = remarks;
	}
	public int getTcode() {
		return tcode;
	}
	public void setTcode(int tcode) {
		this.tcode = tcode;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public int getOwnerAccountId() {
		return ownerAccountId;
	}
	public void setOwnerAccountId(int ownerAccountId) {
		this.ownerAccountId = ownerAccountId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPayeeAccount() {
		return payeeAccount;
	}
	public void setPayeeAccount(int payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Transaction [tcode=" + tcode + ", dateTime=" + dateTime + ", ownerAccountId=" + ownerAccountId
				+ ", amount=" + amount + ", type=" + type + ", payeeAccount=" + payeeAccount + ", remarks=" + remarks
				+ "]";
	}
	
	
}
