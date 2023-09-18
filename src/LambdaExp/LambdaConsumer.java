package LambdaExp;
import java.util.*;
import java.util.function.*;

class EmployeeLambda{
	String ename;
	int salary;
	String gender;
	EmployeeLambda(String ename,int salary,String gender){
		this.ename=ename;
		this.salary= salary;
		this.gender=gender;
	}
}
public class LambdaConsumer {

	public static void main(String[] args) {
		//bonus=sal*10/100;
		//function=bonus>5000;
		//consumer=print empList
		ArrayList<EmployeeLambda> empList= new ArrayList<EmployeeLambda>();
		empList.add(new EmployeeLambda("sam",50000,"male"));
		empList.add(new EmployeeLambda("jeneliya",60000,"female"));
		empList.add(new EmployeeLambda("Devid",55000,"male"));
		
		Function<EmployeeLambda,Integer> f=s->(s.salary*10)/100; //task1
		
		Predicate<Integer> p=b->(b>5000); //task2
		
		Consumer<EmployeeLambda> c=emp->{
		System.out.println(emp.ename);	
		System.out.println(emp.salary);
		System.out.println(emp.gender);
		};										//task3
		
		for(EmployeeLambda e:empList) {
			
			int bonus=f.apply(e);
			if (p.test(bonus)) {
				c.accept(e);
				System.out.println("Bonus is :"+bonus);
			} 

		}

	}

}
