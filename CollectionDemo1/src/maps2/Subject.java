package maps2;

public class Subject implements Comparable<Subject>{

	private String subjectName;
	private String facultyName;
	private int marksObtain;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(String subjectName, String facultyName, int marksObtain) {
		super();
		this.subjectName = subjectName;
		this.facultyName = facultyName;
		this.marksObtain = marksObtain;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public int getMarksObtain() {
		return marksObtain;
	}
	public void setMarksObtain(int marksObtain) {
		this.marksObtain = marksObtain;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facultyName == null) ? 0 : facultyName.hashCode());
		result = prime * result + marksObtain;
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
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
		Subject other = (Subject) obj;
		if (facultyName == null) {
			if (other.facultyName != null)
				return false;
		} else if (!facultyName.equals(other.facultyName))
			return false;
		if (marksObtain != other.marksObtain)
			return false;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Subject o) {
		return this.marksObtain - o.getMarksObtain();
	}
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", facultyName=" + facultyName + ", marksObtain=" + marksObtain
				+ "]";
	}
	
	
	 
}
