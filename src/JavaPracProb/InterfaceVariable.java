package JavaPracProb;

public interface InterfaceVariable {
 int kg=5;
 void purchased();
}
class SellerSanju implements InterfaceVariable{
	 public void purchased() {
		System.out.println("pack the rice of "+kg+" kg");
	}
	
}
