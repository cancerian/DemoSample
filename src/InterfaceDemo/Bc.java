package InterfaceDemo;

public class Bc implements Ac{
	@Override
	public void c1() {
		System.out.println("This is class B of c1()");
	}
	@Override
	public void c2() {
		System.out.println("This is class B of c2()");
	}
	@Override
	public void c3() {
		System.out.println("This is my own default method");
	}
}
