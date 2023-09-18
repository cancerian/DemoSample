package ArrayDemo;

import java.util.*;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] a= new int[5];
		Scanner r=new Scanner(System.in);
		
		System.out.println("enter the array 5");
		

		for(int i=0;i<5;i++) {
			
	
			a[i]=r.nextInt();
			
		}

		for(int i=0;i<5;i++) {
		System.out.println("Original :");
		System.out.print(a[i]+" ");
		
		}
		for(int i=5-1;i>=0;i--) {
			System.out.println("Reverse :");
			System.out.print(a[i]+" ");
		}
	}
	}
 
	


