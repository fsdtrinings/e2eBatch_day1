package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Fidelity;

public class StreamDemoEmployee {

	public static void main(String[] args) {

		StreamDemoEmployee app = new StreamDemoEmployee();

		Employee e1 = new Employee("a", 101, 2000, "New Delhi", 10, 1100058);
		Employee e2 = new Employee("b", 102, 4000, "Chennai", 20, 11515);
		Employee e3 = new Employee("c", 103, 1000, "Banglore", 1, 1515058);
		Employee e4 = new Employee("d", 104, 7000, "New Delhi", 3, 7170058);
		Employee e5 = new Employee("r", 105, 8000, "Banglore", 8, 9595058);
		Employee e6 = new Employee("t", 106, 200, "Mumbai", 10, 2320058);

		List<Employee> allEmployees = Arrays.asList(e1, e2, e3, e4, e5, e6);

		Employee output = app.getMinSalary(allEmployees);
		System.out.println(output);

		System.out.println(" ---------- filter objective -----");

		List<Employee> outputList = app.filterEmployeesBasedOnSalary(allEmployees, 1500, 7500);
		for (Employee employee : outputList) {
			System.out.println(employee);
		}

		System.out.println(" ---------- filter and Map objective -----");

		outputList = app.updateEmployeesSalary(allEmployees, "Banglore");
		for (Employee employee : outputList) {
			System.out.println(employee);
		}

	}

	public Employee getMinSalary(List<Employee> allEmployees) {

		return allEmployees.stream().min((e1, e2) -> e1.getSalary() - e2.getSalary()).get();
	}

	public List<Employee> filterEmployeesBasedOnSalary(List<Employee> allEmployees, int range1, int range2) {

		List<Employee> resultList = allEmployees.stream().filter((emp) -> {
			return emp.getSalary() >= range1 && emp.getSalary() <= range2 ? true : false;
		}).collect(Collectors.toList());

		return resultList;
	}

	public List<Employee> updateEmployeesSalary(List<Employee> allEmployees, String filterLocation) {

		List<Employee> resultList = allEmployees.stream().filter((emp) -> {
			return emp.getLocation().equals(filterLocation) ? true : false;
		}).map((ee) -> {
			int currentSalary = ee.getSalary();
			ee.setSalary((int) (currentSalary * 1.15));
			return ee;
		}).collect(Collectors.toList());

		return resultList;
	}

}// end class
