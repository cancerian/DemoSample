package StringDemo;
import java.util.*;

public class RevString {
	
	public static void main(String[] args) {
		String original="";
		String reverse="";
		Scanner sc=new Scanner(System.in);
		original=sc.next();
		int length=original.length();
		System.out.println("User entered "+original);
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		
		}
		System.out.println("reverse order "+reverse);

	}

}
