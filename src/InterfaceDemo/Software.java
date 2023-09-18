package InterfaceDemo;
import java.util.*;

interface Gill{
	void add();
}
interface Raj extends Gill{
	void sub();
}

class Logic implements Raj{
	int a,b,c,d;
	Scanner s=new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("enter 2 number for addition");
		
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition :"+ c);
	}
	@Override
	public void sub() {
		System.out.println("Enter two number for subtraction");
		
		a=s.nextInt();
		b=s.nextInt();
		 d=a-b;
		 System.out.println("subtraction :"+ d);
	}
	
}
public class Software {

	public static void main(String[] args) {
		Raj lg=new Logic();
		lg.add();
		lg.sub();
	}

}
