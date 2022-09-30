package entity;

public class RelationshipManager {

	private int employeeCode;
	private String employeeName;
	private String email;
	private long phoneNumber;
	
	public RelationshipManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RelationshipManager(int employeeCode, String employeeName, String email, long phoneNumber) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
	@Override
	public String toString() {
		return "RelationshipManager [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
