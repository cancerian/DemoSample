package JavaPracProb;



class Employee{
	
	private int empid;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}
public class GettterSetterEx {
 
 
	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp1=new Employee();
		emp.setEmpid(638521);
		emp1.setEmpid(102);
		System.out.println(emp.getEmpid());
		System.out.println(emp1.getEmpid());
	}

}
