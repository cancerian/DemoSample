package ArrayDemo;

import java.util.Arrays;

public class ArrayEqualsMethodTwo {

	public static void main(String[] args) {
		int[] a= {10,12,14,16,18};
		int[] b= {10,12,14,16,18};
		
		if(a==b) {
			
			System.out.println("equals");
		}else {
			System.out.println("By using == operator ");
			System.out.println("not equals");
		}
		if(Arrays.equals(a, b)) {
			System.out.println("By using equals() Method  ");
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		
	}

}
