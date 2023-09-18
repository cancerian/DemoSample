package ArrayDemo;
import java.util.Scanner;
import java.util.Arrays;

public class ArrSort {

	public static void main(String[] args) {
		int[] a=new int[5];
		int[] a2=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter array of 5 no");
		for(int i=0;i<a.length;i++) {
			
			 a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			
			
		}
		System.out.println("please enter array of 5 no");
		for(int i=0;i<a2.length;i++) {
			
			 a2[i]=sc.nextInt();
		}
		boolean n=Arrays.equals(a, a2);
		System.out.println("this array are equal :"+n);
	}

}
