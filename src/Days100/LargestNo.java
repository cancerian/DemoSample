package Days100;

import java.util.*;
public class LargestNo {
	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num X,Y,Z value");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y && x>z) {
			System.out.println("x is greater "+x);
		}
		else if(y>x && y>z) {
			System.out.println("y is greater "+y);
		}
		else {
			System.out.println("x is greater "+z);
		}
	}
	
}
