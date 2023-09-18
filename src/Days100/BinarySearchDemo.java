package Days100;
import java.util.*;
public class BinarySearchDemo {

	private int getBinary(int[] arr,int x) {
		int start=0;
		int end= arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(x==arr[mid]) {
				return mid;
			}else if(x>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {7,3,8,9,4};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number to check is it in list ot not");
		int x=sc.nextInt();
	
		BinarySearchDemo obj=new BinarySearchDemo();
		int result=obj.getBinary(arr, x);
		if(result==-1) {
			System.out.println("item is not found");
		}else {
			System.out.println("item is found and in index "+result);
		}

}}

