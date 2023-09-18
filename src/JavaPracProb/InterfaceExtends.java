package JavaPracProb;

interface Gill{
	void add();
}
interface Raj extends Gill{
	void sub();
	}
interface shyam extends Raj{
	void mul();
	}

class Anik implements Raj,Gill,shyam{
	@Override
	public void add() {
		int a=10,b=10,c;
		c=a+b;
		System.out.println("Addition :"+c);
	}
	@Override
	public void sub() {
		int a=40,b=10,c;
		c=a-b;
		System.out.println("Subtraction :"+c);
	}
	@Override
	public void mul() {
		int a=40,b=10,c;
		c=a*b;
		System.out.println("Moltiplication :"+c);
	}
}
public class InterfaceExtends {
	public static void main(String[] args) {
		shyam c=new Anik();
		c.add();
		c.sub();
		c.mul();
	}
}

