package allsets;

import java.util.HashSet;
import java.util.Set;

import allList.Employee;

public class SetDemo2 {

	public static void main(String[] args) {
		
		SetDemo2 obj = new SetDemo2();
		 // id+salary+name.length()+3;
		Employee e1 = new Employee("a", 101, 2000); // 101+2000+1+3 = 2105
		Employee e2 = new Employee("b", 102, 1999); // 102+1999+1+3 = 2105
		Employee e3 = new Employee("a", 101, 2000);
		Employee e4 = new Employee("c", 103, 4000);
		Employee e5 = new Employee("d", 104, 14000);
		Employee e6 = new Employee("e", 105, 4000);
		
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		empSet.add(e6);
		
		
		obj.printSet(empSet);
		
		
		
	}
	
	public void printSet(Set<Employee> set)
	{
		for (Employee e : set) {
			System.out.println(e);
		}
	}
	
}
