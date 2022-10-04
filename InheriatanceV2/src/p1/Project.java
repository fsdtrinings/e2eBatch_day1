package p1;

public class Project {

	String projectName;
	int allocatedDays;
	int projectNumber;
	String clientName;
	String projectDomain;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName, int allocatedDays, int projectNumber, String clientName, String projectDomain) {
		super();
		this.projectName = projectName;
		this.allocatedDays = allocatedDays;
		this.projectNumber = projectNumber;
		this.clientName = clientName;
		this.projectDomain = projectDomain;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getAllocatedDays() {
		return allocatedDays;
	}

	public void setAllocatedDays(int allocatedDays) {
		this.allocatedDays = allocatedDays;
	}

	public int getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProjectDomain() {
		return projectDomain;
	}

	public void setProjectDomain(String projectDomain) {
		this.projectDomain = projectDomain;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", allocatedDays=" + allocatedDays + ", projectNumber="
				+ projectNumber + ", clientName=" + clientName + ", projectDomain=" + projectDomain + "]";
	}

		
}
