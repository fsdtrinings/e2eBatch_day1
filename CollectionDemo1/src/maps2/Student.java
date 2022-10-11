package maps2;

import java.util.List;

public class Student implements Comparable<Student>{

	private int rollNum;
	private String name;
	private String stream;
	private StudentDetails profile;
	private List<Subject> allSubjects;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNum, String name, String stream) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.stream = stream;
	}

	public Student(int rollNum, String name, String stream, StudentDetails profile, List<Subject> allSubjects) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.stream = stream;
		this.profile = profile;
		this.allSubjects = allSubjects;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public StudentDetails getProfile() {
		return profile;
	}
	public void setProfile(StudentDetails profile) {
		this.profile = profile;
	}
	public List<Subject> getAllSubjects() {
		return allSubjects;
	}
	public void setAllSubjects(List<Subject> allSubjects) {
		this.allSubjects = allSubjects;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allSubjects == null) ? 0 : allSubjects.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((profile == null) ? 0 : profile.hashCode());
		result = prime * result + rollNum;
		result = prime * result + ((stream == null) ? 0 : stream.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (allSubjects == null) {
			if (other.allSubjects != null)
				return false;
		} else if (!allSubjects.equals(other.allSubjects))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (profile == null) {
			if (other.profile != null)
				return false;
		} else if (!profile.equals(other.profile))
			return false;
		if (rollNum != other.rollNum)
			return false;
		if (stream == null) {
			if (other.stream != null)
				return false;
		} else if (!stream.equals(other.stream))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student stu) {
		return this.rollNum - stu.getRollNum();
	}

	@Override
	public String toString() {
		return rollNum+" "+name+" "+stream+" "+profile.getState();
	}
	

	
	 
	
}
