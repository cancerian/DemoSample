package ArrayDemo;
import java.util.*;
public class SearchElementInArray {

	public static void main(String[] args) {
		int[] a=new int[5];
		int n;
		int count=0;
		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.println("Enter array Element");
			
			for(int i=0;i<a.length;i++) {
				a[i]=sc1.nextInt();
			}
			System.out.println("Elements entered");
			for(int i=0;i<a.length;i++) {
				
				System.out.println(a[i]+" ");
			}
			System.out.println("Enter the element you want to find form array");
			n=sc1.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==n) {}
			count++;
		}
		if(count>0) {
			System.out.println("Element found");
		}else {
			System.out.println("element not Found");
		}

}
}