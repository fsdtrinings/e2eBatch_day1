package p1;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAPG_Student")
public class Student {

	@Id
	private int id;
	@Column(name="Participant_Name")
	private String studentName;
	private String batchName;
	private int raiting;
	private String remarks;
	private String projectTeam;
	
	@Embedded
	private Address address;
	
	@Embedded
	@AttributeOverrides({
	      @AttributeOverride(name = "houseNumber", column = @Column(name = "temp_houseNumber")),
	      @AttributeOverride(name = "city", column = @Column(name = "temp_city")),
	      @AttributeOverride(name = "state", column = @Column(name = "temp_state")),
	      @AttributeOverride(name = "country", column = @Column(name = "temp_country")),
	      @AttributeOverride(name = "pincode", column = @Column(name = "temp_pincode")),
	})
	private Address tempAddress;
	
	
	@ElementCollection
	@CollectionTable(name = "StudentCertificates")
	private List<Certification> allCertificates;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String batchName, int raiting, String remarks, String projectTeam) {
		super();
		this.studentName = studentName;
		this.batchName = batchName;
		this.raiting = raiting;
		this.remarks = remarks;
		this.projectTeam = projectTeam;
	}
	
	
	
	
	public List<Certification> getAllCertificates() {
		return allCertificates;
	}
	public void setAllCertificates(List<Certification> allCertificates) {
		this.allCertificates = allCertificates;
	}
	public Address getTempAddress() {
		return tempAddress;
	}
	public void setTempAddress(Address tempAddress) {
		this.tempAddress = tempAddress;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public int getRaiting() {
		return raiting;
	}
	public void setRaiting(int raiting) {
		this.raiting = raiting;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getProjectTeam() {
		return projectTeam;
	}
	public void setProjectTeam(String projectTeam) {
		this.projectTeam = projectTeam;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", batchName=" + batchName + ", raiting="
				+ raiting + ", remarks=" + remarks + ", projectTeam=" + projectTeam + ", address=" + address + "]";
	}

	
	
	
}
