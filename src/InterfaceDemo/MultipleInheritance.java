package InterfaceDemo;
interface A{
	void show();
}
interface B extends A{
	void disp();
}
class CommonClass implements A,B{
	public void show(){
	System.out.println("This is A Interface");	
	}
	public void disp(){
	System.out.println("This is B Interface");	
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		CommonClass cc=new CommonClass();
		cc.show();
		cc.disp();

	}

}
