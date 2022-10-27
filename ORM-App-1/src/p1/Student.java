package p1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	private String studentName;
	private String batchName;
	private int raiting;
	private String remarks;
	private String projectTeam;
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
	
	
	
}
