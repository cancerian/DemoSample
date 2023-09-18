package JavaPracProb;

public class StudentInheritance {
int roll,marks;
String name;
void input() {
	System.out.println("Enter the rollno, marks and name:");
}

}
class Ankit extends StudentInheritance{
	void disc(){
		roll=25;name="ankit";marks=55;
		System.out.println(name+" "+roll+" "+marks);
	}
	public static void main(String[] args) {
		Ankit a=new Ankit();
		a.input();
		a.disc();
		
		
	}
}
