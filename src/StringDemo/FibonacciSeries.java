package StringDemo;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,input;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the no to find fibonacci series");
		input=sc.nextInt();
		for(int i=2;i<input;++i) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
		}
		
	}


