package p1;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ramesh",101, 2000);
		Employee e2 = new Employee("Ramesh",101, 2000);
		Employee e3 = new Employee("Mike",777, 12000);
		Employee e4 = e1;
		
		// through == we cannot check the object equvialence
		System.out.println(e1 == e2);
		
		// use object class equals() to check object equality 
		
		boolean isSame = e1.equals(e2);
			
		System.out.println(isSame); 
	// equals method will not give correct result if its not overriden in the (bean/entity)class	
		
		
	}
}
