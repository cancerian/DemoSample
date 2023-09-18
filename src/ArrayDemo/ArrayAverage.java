package ArrayDemo;
import java.util.*;
public class ArrayAverage {

	public static void main(String[] args) {
		int[] a=new int[5];
		double sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Five array value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array value");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("Array Average :");
		for(int i=0;i<a.length;i++) {
			sum=a[i]+sum;
			
		}
		System.out.println("Sum is "+ sum);
		avg=sum/5.0;
		System.out.println("Average :"+ avg);

	}
}