package Days100;

public class FactorialDemo {
	
	private static int factorial(int n) {
		
		if (n==1) {
			return 1;
		}else {
			
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("factorial is "+factorial(4));
	}
	

}
