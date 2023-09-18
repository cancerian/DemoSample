package JavaPracProb;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter the number to find ArmStrong number");
		int number=sc.nextInt();
		int remainder,originalNumber,result=0;
		
		originalNumber=number;
		while(originalNumber!=0) {
			remainder=originalNumber%10;
			result +=Math.pow(remainder, 3);
			originalNumber/=10;
		}
		if (result==number) {
			System.out.println(number+" this is armstrong no.");
		}else {
			System.out.println(number+" this is not armstrong no.");
		}
	}

}
