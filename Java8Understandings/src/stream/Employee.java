package stream;
                       // step 1 
public class Employee implements Comparable<Employee>{

	private String name;
	private int id;
	private int salary;
	private String location;
	private int yearOfExp;
	private long pinCode;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	
	public Employee(String name, int id, int salary, String location, int yearOfExp, long pinCode) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.location = location;
		this.yearOfExp = yearOfExp;
		this.pinCode = pinCode;
	}
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getYearOfExp() {
		return yearOfExp;
	}
	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", location=" + location
				+ ", yearOfExp=" + yearOfExp + ", pinCode=" + pinCode + "]";
	}
	
	@Override
	public int hashCode() {
		// algo for hash code 
	//	System.out.println(" inside Hashcode code for employee :- "+id);
		return id+salary+name.length()+3;
	}
	@Override
	public boolean equals(Object obj) {
		
		 //code to inform java , how to compare two employees
		
		// type cast obj to Employee type 
		//System.out.println(" inside equals for employee :- "+id);
		
		if(obj instanceof Employee)
		{
			// if its employee , then compare each property one by one 
			
			Employee e2 = (Employee) obj;
			
			boolean a = this.name.equals(e2.getName());
			boolean b = this.id == e2.getId(); 
			boolean c = this.salary == e2.getSalary();
			
			return a && b && c;
			
		
		}
		else
		{
			return false; 
			// in case if not employee , so not comprable 
		}
		
	
	}
	@Override
	public int compareTo(Employee e2) {
		
		return  e2.getId()-this.id;
	}

	
	
	
	
	
}
