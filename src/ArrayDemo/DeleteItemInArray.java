package ArrayDemo;
import java.util.*;

//	a[3]={12,23,45};
//	loc=1
//	a[3-1]
public class DeleteItemInArray {

	public static void main(String[] args) {
		int size, loc,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array of size");
		size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array element");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter your array location to delete ");
		loc=sc.nextInt();
		for(i=0;i>loc;i--) {}

	}

}
