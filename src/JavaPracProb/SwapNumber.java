package JavaPracProb;
import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		int x,y,a, b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number to swap");
		System.out.println("Enter 1 number to swap");
		x=sc.nextInt();
		System.out.println("Enter 2 number to swap");
		y=sc.nextInt();
		System.out.println("Enter 3 number to swap");
		a=sc.nextInt();
		System.out.println("Enter 4 number to swap");
		b=sc.nextInt();
				
		System.out.println("show the number before swip"+x+" "+y+" "+a+" "+ b);
		temp=b;
		b=x;
		x=temp;
		temp=a;
		a=y;
		y=temp;
		System.out.println("number after swap"+x+" "+y+" "+a+" "+ b);
		

	}

}
