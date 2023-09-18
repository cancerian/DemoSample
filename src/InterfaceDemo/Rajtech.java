package InterfaceDemo;

interface ClientOne{
	void webdesign();
	void webdevelopment();
	
}
abstract class AscentSoftware implements ClientOne{
	@Override
	public void webdesign() {
		
		System.out.println("create home page, main Body, page bottom");
	}
}

class ShayamTech extends AscentSoftware{
	public void webdevelopment() {
		System.out.println("developed model and logic of program");
	}
	
}

public class Rajtech {

	public static void main(String[] args) {
		ClientOne co=new ShayamTech();
		co.webdesign();
		co.webdevelopment();
	}

}
