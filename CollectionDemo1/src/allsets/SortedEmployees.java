package allsets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import allList.Employee;
import othersortings.EmployeeSortingBasedOnLocation;
import othersortings.EmployeeSortingBasedOnPincode;
import othersortings.EmployeeSortingBasedOnSalary;

public class SortedEmployees {

	public static void main(String[] args) {

		SortedEmployees obj = new SortedEmployees();
				

		Employee e1 = new Employee("a", 101, 2000, "New Delhi", 10, 1100058);
		Employee e2 = new Employee("b", 102, 4000, "Chennai", 20, 11515);
		Employee e3 = new Employee("c", 103, 1000, "Banglore", 1, 1515058);
		Employee e4 = new Employee("d", 104, 7000, "New Delhi", 3, 7170058);
		Employee e5 = new Employee("r", 105, 8000, "Banglore", 8, 9595058);
		Employee e6 = new Employee("t", 106, 200, "Mumbai", 10, 2320058);

		Set<Employee> allEmployees = new TreeSet<>();
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		allEmployees.add(e4);
		allEmployees.add(e5);
		allEmployees.add(e6);
		
		
		obj.printCollection(allEmployees," Print Set based on Default Sorting ");
		

		// ------------------------------------------------------

		 // in order to get the customized sorted output 
		// we should use Collections.sort();
		// collection.sort method takes list as input , but we have Set 
		// so convert set to list
		
		List<Employee>  sortedEmployeesBySalary = new ArrayList<>(allEmployees);
		// step1 : convertion of set to List
		// note : by providing set in the constructor of ArrayList , we can convert the set into list
		
		// provide list to Collections.sort() // NOTE :- Collections is the class in util package
		// https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List)
		
		Collections.sort(sortedEmployeesBySalary, new EmployeeSortingBasedOnSalary());
		
		// Note on sort method 
		// argument 1: list of data 
		// argument 2 : way of sorting , {means the object of SortedClass}
		
		obj.printCollection(sortedEmployeesBySalary, " Print Set based on Salary ");
			
		// -------------------------------------------------------------------------------
		
		List<Employee> sortedEmployeesByLocation = new ArrayList<>(allEmployees);
		Collections.sort(sortedEmployeesByLocation,new EmployeeSortingBasedOnLocation());
		obj.printCollection(sortedEmployeesByLocation, " Print List of Employees based on Location");
		
		// -------------------------------------------------------------------------------
		
		List<Employee> sortedEmployeesByPincode = new ArrayList<>(allEmployees);
		Collections.sort(sortedEmployeesByPincode,new EmployeeSortingBasedOnPincode());
		obj.printCollection(sortedEmployeesByPincode, " Print List of Employees based on Pincode");
		
		
		
	}
	
	public void printCollection(Collection<Employee> collection, String tagLine)
	{
		System.out.println(" \n\n ===============  "+tagLine+"   ==========================\n");
		for (Employee e : collection) {
			System.out.println(e);
		}
	}
}


















