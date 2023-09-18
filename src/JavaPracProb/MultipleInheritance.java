package JavaPracProb;
interface A{
	void show();
}
interface B{
	void display();
}
public class MultipleInheritance implements A,B {

	public void show() {
		System.out.println("this is A  interface");
	}
	public void display() {
		System.out.println("this is  B interface");
	}
	

}
