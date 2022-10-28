package p1;

import javax.persistence.Embeddable;
// @Entity // hibernate will create a new table for Address

@Embeddable // hibernate will not create new table for Address , instead hibernate will {wait} to embed Address inside another table
public class Address {

	private String houseNumber;
	private String city;
	private String state;
	private String country;
	private long pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String houseNumber, String city, String state, String country, long pincode) {
		super();
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}
	
	
	
}
