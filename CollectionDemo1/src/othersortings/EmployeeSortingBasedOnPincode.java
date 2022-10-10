package othersortings;

import java.util.Comparator;

import allList.Employee;

public class EmployeeSortingBasedOnPincode implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return (int)(e1.getPinCode() - e2.getPinCode());
	}
	
	

}
