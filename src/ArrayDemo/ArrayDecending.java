package ArrayDemo;

import java.util.Scanner;

public class ArrayDecending {

	public static void main(String[] args) {
		int[] a=new int[5];
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter array of five");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<5;j++) {
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++ ) {
			System.out.print(a[i]+" ");
		}
	}

}
