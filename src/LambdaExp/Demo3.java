package LambdaExp;


interface Cab3{
	public String bookCab(String source, String destination);
}
/*class Ola implements Cab3{
	public String bookCab(String source, String destination) {
		
		System.out.println("ola booked from "+ source +" to "+destination);
		return ("Price : 5000");
	}
}
*/

public class Demo3 {
	public static void main(String[] args) {
		Cab3 cab=( source,  destination)->{	
			System.out.println("ola booked from "+ source +" to "+destination);
			return ("Price : 5000");
		};
		System.out.println(cab.bookCab("Hydrabad","mumbai"));
	}
}
