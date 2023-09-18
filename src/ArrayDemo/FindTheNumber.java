package ArrayDemo;

//Integer List with [1,2,3,4,5,6] , separate into 2 different lists one with even  numbers and other with odd.

public class FindTheNumber {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6};
		
		for(int i=0;i<=num.length;i++) {
			if(num[i]%2==0) {
				
				System.out.println("Even :"+ num[i]);
				
		}else {
			System.out.println("Odd :"+ num[i]);
		}
	}

	}}
