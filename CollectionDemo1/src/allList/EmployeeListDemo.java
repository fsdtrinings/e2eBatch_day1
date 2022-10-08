package allList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDemo {

	List<Employee> allEmployees = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		/*
		 * call business methods based on user inputs 
		 * */
		
	}
	
	public void addEmployee()
	{
		Employee e = new Employee("ramesh", 101, 2000); // get all details from user
	
		// code to add employee in collection (allEmployee)
		
		allEmployees.add(e);
	}
	
	public void printAllEmployees()
	{
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}
	
	public void getEmployeeById()
	{
		boolean isFound = false;
		System.out.println("Enter the Id to be searched ");
		int searchedId = 101; // sc.nextInt();
		for (Employee employee : allEmployees) {
			if(employee.getId() == searchedId)
			{
				// employee found
				isFound = true;
				System.out.println(employee);
			}
		}
		
		if(!isFound)
		{
			// means employee not in the list
			System.out.println(searchedId+"  employee id is not in the list");
		}
	}
	
}



/*
 * Student 
 * Account 
 * Dog 
 * Animal
 * Insurance 
 * Policy 
 * Book 
 * LinkedProfile 
 * Video
 * 
 * 
 * */






