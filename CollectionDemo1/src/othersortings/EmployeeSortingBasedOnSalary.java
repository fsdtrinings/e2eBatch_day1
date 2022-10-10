package othersortings;

import java.util.Comparator;

import allList.Employee;

public class EmployeeSortingBasedOnSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary() - e2.getSalary();
	}
	
	

}
