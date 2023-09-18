package ArrayDemo;
import java.util.*;
public class AdditionOfArrays {

	public static void main(String[] args) {
		int[] a=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the array value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array element");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
			sum=a[i]+sum;
		}
		System.out.println("Addition of array"+sum);

	}

}
