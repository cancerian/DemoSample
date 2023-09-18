package StringDemo;
import java.util.*;
public class StringCount {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 100 word");
	String s=sc.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++) {
		try {
			//if(s.charAt(i)!=' ') 
				count++;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count>100){
			System.out.println("Only 100 word are allowed");
			 break;
		}else{
			System.out.println("For Review and sharing your Experiance..");
			 break;
		}}
	
	System.out.println("thank you!");
}
}
