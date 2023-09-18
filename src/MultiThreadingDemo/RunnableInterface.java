package MultiThreadingDemo;
class Arun implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Today is Sunday");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class RunnableInterface {
public static void main(String[] args) {
	Arun a =new Arun();
	Thread n=new Thread(a);
	n.start();
}
}
