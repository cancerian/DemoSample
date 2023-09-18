package LambdaExp;

interface Cab1{
	public void bookCab(String source, String destination);
}


public class Demo2 {
	
public static void main(String[] args) {
	Cab1 n=(source,destination)->System.out.println("your cab is booked from "+source+ " to " +destination);
	n.bookCab("Pune","Nagpur");
}
}
