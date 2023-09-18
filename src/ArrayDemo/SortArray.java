package ArrayDemo;


import java.util.Arrays;
//sort the zeros and ones in an array int [] array ={0,1,0,0,1,0,1,0,0,1} ; 
//output should be Sorted array: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] wtp in java
public class SortArray {

	public static void main(String[] args) {
		int[] num ={0,1,0,0,1,0,1,0,0,1} ; 
		int[] Arr = { 10, 30, 35, 52, 75 };
		
		Arrays.sort(num);
		for(int n:num) {
			System.out.print(n+", ");
		}
		// Converting elements into list
		System.out.println("The Integer Array as a List = "+ Arrays.asList("Arr :"+Arr.toString()));

	}

}
