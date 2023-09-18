package MultiThreadingDemo;

class Join extends Thread{
	
	public void run() {
		 String n=Thread.currentThread().getName();
		for (int i = 0; i <= 5; i++) {
			System.out.println(n);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoinMethod {
	public static void main(String[] args)throws IllegalThreadStateException {
		Scheduler s1=new Scheduler();
		Scheduler s2=new Scheduler();
		Scheduler s3=new Scheduler();
		s1.setName("Thread 1");
		s2.setName("Thread 2");
		s3.setName("Thread 3");
		
		
		s2.start();
		try {
			s2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		s1.start();
		s3.start();
		

	}
}
