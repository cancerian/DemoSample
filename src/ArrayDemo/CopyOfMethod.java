package ArrayDemo;
import java.util.*;
public class CopyOfMethod {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 5 Array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			
		}
		
		int[] b=Arrays.copyOf(a, 6);
		b[5]=100;
		System.out.println("data Array2 :");
		for(int i=0;i<b.length;i++) {
			
				System.out.println(b[i]+" ");
		}

	}

}
