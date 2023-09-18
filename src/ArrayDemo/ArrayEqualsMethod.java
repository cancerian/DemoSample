package ArrayDemo;

import java.util.*;


public class ArrayEqualsMethod {

	public static void main(String[] args) {
		int[] a=new int[5];
		int[] b=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the A arrays elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter the B arrays elements");
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		boolean c=Arrays.equals(a,b);
		System.out.println("this both array is equals "+ c);
		
	}

}
