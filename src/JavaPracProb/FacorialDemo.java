package JavaPracProb;
import java.util.*;
public class FacorialDemo {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the num to find factorial");
		int i=sc.nextInt();
		
		System.out.println("find the factorial "+ factorial(i));
	}
}
public static int factorial(int i) {
	if (i==1) {
		return i;
	} else {
		return i*factorial(i-1);
	}
}
}