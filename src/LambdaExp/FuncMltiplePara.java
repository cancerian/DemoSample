package LambdaExp;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
class EmployeeFunc{
	String ename;
	int sal;
	EmployeeFunc(String ename,int sal){
		this.ename=ename;
		this.sal=sal;
	}
}

public class FuncMltiplePara {

	public static void main(String[] args) {
		
		ArrayList<EmployeeFunc> empList=new ArrayList<EmployeeFunc>();
		empList.add(new EmployeeFunc("David",50000));
		empList.add(new EmployeeFunc("John",30000));
		empList.add(new EmployeeFunc("Marry",20000));
		empList.add(new EmployeeFunc("Scoot",40000));
		
	Function<EmployeeFunc,Integer> f= e->{
		int salary=e.sal;
		if(salary>=10000 && salary<=20000) {
			return (salary*10/100);
		}else if(salary>20000 && salary<=30000) {
			return (salary*20/100);
		}else if(salary>30000 && salary<=40000) {
			return (salary*30/100);
		}else if(salary>40000 && salary<=50000) {
			return (salary*40 /100);
		}
		return salary;
	};
	Predicate<Integer> bon=b->(b>5000);
	
	for(EmployeeFunc emp:empList) {
	int bonus=f.apply(emp);
	if(bon.test(bonus)) {
	System.out.println("Name :"+emp.ename+"Salary:"+emp.sal);
	System.out.println("Get the bonus :"+bonus);
	}
	}

	}

}
