package ArrayDemo;
import java.util.*;
public class ArraySortMethod {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 5 arrays elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}

	}

}
