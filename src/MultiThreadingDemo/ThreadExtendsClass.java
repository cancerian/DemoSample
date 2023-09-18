package MultiThreadingDemo;

import java.util.Iterator;

class A extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Subrat and Sneha");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
public class ThreadExtendsClass {
	public static void main(String[] args) {
		A a=new A();
		a.start();

	}
}
