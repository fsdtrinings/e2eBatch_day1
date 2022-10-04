package p1;

public class Accountant extends Employee {
	
	String fileName;

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accountant(String name, int id, int salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	public Accountant(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public Accountant(String name, int id, int salary,String fileName) {
		super(name, id, salary);
		this.fileName = fileName;
		// TODO Auto-generated constructor stub
	}

	public void workingOnFile()
	{
		System.out.println(" working on file "+fileName);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
}
