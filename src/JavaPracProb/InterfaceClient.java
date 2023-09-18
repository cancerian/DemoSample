package JavaPracProb;

public interface InterfaceClient {
	
	void webdesign();
	void webdevelopment();
	
} 
abstract class Rajtech implements InterfaceClient{
	public void webdesign() {
		System.out.println("Devlop page, logo");
	}
}
class RahulTech extends Rajtech{
	public void webdevelopment() {
		System.out.println("backend and database Connections");
	}
}
