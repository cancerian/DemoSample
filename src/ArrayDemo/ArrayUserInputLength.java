package ArrayDemo;
import java.util.*;
public class ArrayUserInputLength {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the arrays");
		for(int i=0;i<a.length;i++) {
			
			a[i]=s.nextInt();
		}
		System.out.print("Array Element ");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
			
		}
		System.out.print("\nArray :"+ a.length);

	}

}
