package assignmentsSession7;
import java.util.*;
public class ElectricityBill {
	 static int consumerNo;
	 static String consumerName;
	 static double previousMonthReading;
	 static double currentMonthReading;
     static String connectionType;
     static String  unitsConsumed;
     static double total;
     static double totalbill;
    
    //constructor
	public ElectricityBill(int consumerNo, String consumerName, double previousMonthReading, double currentMonthReading,
			String connectionType) {
		
		ElectricityBill.consumerNo = consumerNo;
		ElectricityBill.consumerName = consumerName;
		ElectricityBill.previousMonthReading = previousMonthReading;
		ElectricityBill.currentMonthReading = currentMonthReading;
		ElectricityBill.connectionType = connectionType;
	}
	
	public static void display() {
		
		System.out.println("This is consumer No"+consumerNo);
		System.out.println("\"This is consumer name "+consumerName);
		System.out.println("Previous month reading "+previousMonthReading);
		System.out.println("Current month reading "+currentMonthReading);
		System.out.println("type of connection is "+connectionType);
		System.out.println("Total amount of Bill is "+calculateBillAmount());
	
	}
	
	public static double calculateBillAmount() {	
		 double unitsConsumed = currentMonthReading - previousMonthReading;
	        double total = 0.0;
	        if(connectionType.equalsIgnoreCase("domestic") ) {
	        	if(unitsConsumed<100) {
	        		total=unitsConsumed*1.0;
	        	}else if(unitsConsumed>101 && unitsConsumed<200) {
	        		total=unitsConsumed*2.50;
	        	}else if(unitsConsumed>201 && unitsConsumed<500) {
	        		total=unitsConsumed*4;
	        	}else  {
	        		total=unitsConsumed*6;
	        	}
	        }else if(connectionType.equalsIgnoreCase("commercial") ) {
	        	if(unitsConsumed<100) {
	        		total=unitsConsumed*2;
	        	}else if(unitsConsumed>101 && unitsConsumed<200) {
	        		total=unitsConsumed*4.50;
	        	}else if(unitsConsumed>201 && unitsConsumed<500) {
	        		total=unitsConsumed*6;
	        	}else  {
	        		total=unitsConsumed*7;
	        	}
	        }
			return total;
			

	}

	

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Consumer Number");
		int consumerNo=ss.nextInt();
		System.out.println("Enter the Consumer Name");
		String consumerName=ss.next();
		System.out.println("enter prevoius Meter Reading");
		double previousMonthReading=ss.nextInt();
		System.out.println("enter current reading ");
		double currentMonthReading=ss.nextInt();
		System.out.println("Enter ConnectionType commercial or domestic");
		String connectionType=ss.next();
		
		ElectricityBill eb=new ElectricityBill(consumerNo,consumerName,previousMonthReading,currentMonthReading,connectionType);
		
		
		eb.display();
		 
		
		 
	}
	
}
