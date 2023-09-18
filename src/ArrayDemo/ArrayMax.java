package ArrayDemo;
import java.util.*;
public class ArrayMax {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array to find max element");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
System.out.println("Max is :"+max);

int min=a[0];
for(int i=0;i<a.length;i++) {
	if(a[i]<min) {
		min=a[i];
	}
}
System.out.println("Max is :"+min);
	}

}
