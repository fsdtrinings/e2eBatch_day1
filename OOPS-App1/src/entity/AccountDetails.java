package entity;

public class AccountDetails {

	private String address;
	private String city;
	private String email;
	private long phoneNumber;
	private String panCard;
	private String adharNumber;
	
	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDetails(String address, String city, String email, long phoneNumber, String panCard,
			String adharNumber) {
		super();
		this.address = address;
		this.city = city;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.panCard = panCard;
		this.adharNumber = adharNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	@Override
	public String toString() {
		return "AccountDetails [address=" + address + ", city=" + city + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", panCard=" + panCard + ", adharNumber=" + adharNumber + "]";
	}
	
	
	
}
