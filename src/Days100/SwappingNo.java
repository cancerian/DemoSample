package Days100;

import java.util.*;

public class SwappingNo {
	int a,b,temp;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+" "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping"+a+" "+b);
		

	}
}
