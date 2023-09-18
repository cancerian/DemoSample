package Pattern;
import java.io.*;
import java.util.*;

public class TimeTaskDemo {

	public static void main(String[] args) {
		Timer timer=new Timer();
		
		TimerTask tt=new TimerTask() {
			@Override
			public void run() {
				System.out.println("Timer task is complete :)");
			}
		
	};
	Calendar date= Calendar.getInstance() ;
	date.set(Calendar.YEAR,2023);
	date.set(Calendar.MONTH,Calendar.JUNE);
	
	
	//timer.schedule(tt, 3000);
}
}