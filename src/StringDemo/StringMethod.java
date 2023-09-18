package StringDemo;
import java.util.*;
public class StringMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
String name="subrat";
System.out.println("Enter your name");	
String result=sc.next();
if(result.equalsIgnoreCase(name)) {
System.out.println("This is equal");	
	
}else {
	System.out.println("not equal");	
	
}
 System.out.println(name.charAt(2));
 System.out.println(name.indexOf("u"));
 System.out.println(name.isEmpty());
 System.out.println(name.toUpperCase());
	


	}

}
