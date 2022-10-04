package p1;

public class Developer extends Employee{

	private Project project;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(String name, int id, int salary,Project p) {
		super(name, id, salary);
		this.project = p;
		// TODO Auto-generated constructor stub
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	
	
	
	
}
