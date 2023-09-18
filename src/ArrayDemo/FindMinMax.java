package ArrayDemo;
import java.util.*;

public class FindMinMax {
	
	private int max(int[] arr) {
		int max=0;
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	private int min(int[] arr) {
		int min=arr[0];
		for(int i=0;i<=arr[i];i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		return min;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		FindMinMax fm=new FindMinMax();
		

	}

}
