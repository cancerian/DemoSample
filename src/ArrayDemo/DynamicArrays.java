package ArrayDemo;
import java.util.*;
public class DynamicArrays {

	public static void main(String[] args) {
		
		int x,i;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the array size");
			x=sc.nextInt();

			int[] a=new int[x];
			
			for( i=0;i<x;i++) {
				
					
					a[i]=sc.nextInt();
				
				
			}
			System.out.println("Printed");
			for( i=0;i<x;i++) {
				
				
			System.out.println(a[i]);
			}
		}
	

	}}
