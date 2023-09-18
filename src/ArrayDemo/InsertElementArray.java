package ArrayDemo;
import java.util.*;
public class InsertElementArray {

	public static void main(String[] args) {
		int size,location,item,i;
		
		Scanner se=new Scanner(System.in);
		System.out.println("enter the array size");
		size=se.nextInt();
		int[] a=new int[size+1];
		System.out.println("enter the array elements :");
		for(i=0;i<size;i++) {
			a[i]=se.nextInt();
		}
		System.out.println("enter array location");
		location=se.nextInt();
		System.out.println("enter array item");
		item=se.nextInt();
		for(i=size;i>location;i--) {
			a[i]=a[i-1];
		}
		a[location]=item;
		size++;
		for( i=0;i<size;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
