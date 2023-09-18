package Days100;

import java.util.*;
public class LSearch2 {

	public static void main(String[] args) {
		int[] arr= {9,5,3,4,1,2};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int item=sc.nextInt();
		int itemNotFound=0;
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				System.out.println("this item is  which is "+item +" and index is "+i);
				itemNotFound=itemNotFound+1;
			}
			
		}
		if(itemNotFound==0) {
			System.out.println("item is not found");
		}

	}

}
