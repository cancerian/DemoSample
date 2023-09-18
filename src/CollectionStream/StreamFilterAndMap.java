package CollectionStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String empName;
	int empSalary;
	
	public Employee(int empId, String empName, int empSalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
}

public class StreamFilterAndMap {
	

	public static void main(String[] args) {
		
		List<Employee> emp=Arrays.asList(
				new Employee(101,"Max",10000), 
				new Employee(102,"Sam",20000),
				new Employee(103,"Peter Pan",30000),
				new Employee(104,"Will",40000));
		
		List<Integer> empSalList=emp.stream()
		.filter(s->s.empSalary>20000)
		.map(sal->sal.empSalary )
		.collect(Collectors.toList());
		System.out.println(empSalList);
	}

}
