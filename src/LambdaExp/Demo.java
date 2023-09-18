package LambdaExp;


@FunctionalInterface
interface Cab {
	 public void bookCab();
}



public class Demo {
	
	public static void main(String[] args) {
		
		
		Cab cab=()->System.out.println("ola cab is booked");
	
		cab.bookCab();
	}

}
