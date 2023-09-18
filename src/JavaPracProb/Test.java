package JavaPracProb;

public class Test {
	
		  int x;

		  public Test(int y) {
		    x = y;
		    
		  }

		  public static void main(String[] args) {
			  Test myObj = new Test(10);
		    myObj.x=5;
		   
		    System.out.println(myObj.x);
		   
		  }
		}

