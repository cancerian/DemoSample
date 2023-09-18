package StringDemo;

public class StrReverse {
static String reverseString(String sentance) {
StringBuilder n=new StringBuilder();
	
	n.reverse();
	
	return n.toString();
}
	public static void main(String[] args) {
		
		System.out.println(StrReverse.reverseString("my name is niki"));; 
		
	}
	
}
