package ArrayDemo;
import java.util.*;
public class CopyArrayOnSecondArray {

	public static void main(String[] args) {
		int a[]=new int [5];
		int b[]=new int [5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array");
		for(int i=0;i<5;i++) {
			
			a[i]=s.nextInt();
		}
		System.out.println("First elements");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("second elements");
		for(int i=0;i<5;i++) {
			b[i]=a[i];
			System.out.println(b[i]+" ");
		}

	}

}
