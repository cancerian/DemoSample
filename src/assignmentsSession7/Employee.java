package assignmentsSession7;
 import java.util.*;

public class Employee {
	public String empname;
	public int empId;
	public String address;
	public String mailId;
	public String mobileno ;
	double basicPay;
	
	
	public Employee(String empname, int empId, String address, String mailId, String mobileno,double basicPay) {
		
		this.empname = empname;
		this.empId = empId;
		this.address = address;
		this.mailId= mailId;
		this.mobileno = mobileno;
		this.basicPay=basicPay;
		
	}

	public double calculateGrossSalary() {
		
        double da = 0.97 * basicPay;
        double hra = 0.1 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;

        return basicPay + da + hra - pf - staffClubFund;
    }
	public void output() {
		System.out.println("Employee Name :"+empname);
		System.out.println("Employee EmpId :"+empId);
		System.out.println("Employee Address :"+address);
		System.out.println("Employee MailId :"+mailId);
		System.out.println("Employee Contact :"+mobileno);
		System.out.println("Employee Basic Pay :"+basicPay);
		System.out.println("Employee GrossSalary2 :"+calculateGrossSalary());
		
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee employee;
	System.out.println("Enter your choice of Employee");
	System.out.println("(Programmer=1)(AssistantProfessor=2)(AssociateProfessor=3)(Professor=4)");
	int choice=sc.nextInt();
	if(choice==1) {
		employee=new Programmer("john",1001,"pune","john@gmail.com","934923492",82000);
		employee.output();
	}else if(choice==2) {
		employee=new AssistantProfessor("mac",1002,"pune","mac@gmail.com","23123123",75000);
		employee.output();
	}else if(choice==3) {
		employee=new AssociateProfessor("mukesh",1003,"pune","john@gmail.com","934923492",80000);
		employee.output();
	}else if(choice==4) {
		employee=new Professor("Ram",1004,"pune","Ram@gmail.com","8384923492",47000);
		employee.output();
	}else {
		System.out.println("Please select the right choice or something went wrong");
	}
	
	
	}
}
	
	
	
	
	
	
	
