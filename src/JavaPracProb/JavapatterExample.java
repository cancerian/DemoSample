package JavaPracProb;

public class JavapatterExample {
	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					if(i==1 ||i==4||i==5||j==1||j==4||j==5) {
					System.out.print("*");}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
