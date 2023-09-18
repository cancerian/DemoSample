package MultiThreadingDemo;
class Scheduler extends Thread{
	
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
public class ThreadSchduler {

	public static void main(String[] args)throws IllegalThreadStateException {
		Scheduler s1=new Scheduler();
		Scheduler s2=new Scheduler();
		Scheduler s3=new Scheduler();
		s1.setName("Thread 1");
		s2.setName("Thread 2");
		s3.setName("Thread 3");
		s1.start();
		s2.start();
		s3.start();
		

	}

}
