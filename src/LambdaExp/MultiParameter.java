package LambdaExp;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int experiance;
	public Employee(String ename, int salary, int experiance) {
		
		this.ename = ename;
		this.salary = salary;
		this.experiance = experiance;
	}
}

public class MultiParameter {

	public static void main(String[] args) {
		//Ex1
		Employee emp=new Employee("John",52000,5);
		//emp obj----> salary>30000 and experiance>3
		Predicate<Employee> pr=e->(e.salary>30000 && e.experiance>3);
		System.out.println(pr.test(emp));//true

		//Ex2
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("John",52000,5));
		al.add(new Employee("Devid",20000,2));
		al.add(new Employee("Scott",30000,3));
		al.add(new Employee("Marry",40000,6));
		
		for(Employee e:al) {
			if(pr.test(e)) {
				System.out.println(e.ename+" "+e.salary);
			}
		}
		}
	}


