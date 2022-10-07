package exceHandling;

class Employee
{
	public void printEmployeeData() {
		System.out.println(" some emp data");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		
		Demo3 obj = new Demo3();
		
		
		Employee e = obj.getEmployeeFromDB(90);
		
		if(e == null)
		{
			NullPointerException npe = new NullPointerException("Employee Not found in DB");
			throw npe; // developer is manually throwing any exception (based on use case requirement)
			
		}
		else
		{
			e.printEmployeeData();
		}
		
		System.out.println(" --- app close ----");
	}
	
	public Employee getEmployeeFromDB(int searchId)
	{
		// some code to fetch employee from db
		return null;
	}
	
	
	
}
