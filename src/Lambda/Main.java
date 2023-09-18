package Lambda;

public class Main {

	public static void main(String[] args) 
	{
	String name="Rakesh";
	char symbol='!';
	
		MyInteface myInteface= (x,y) -> {
			System.out.println("Hello world!");
			System.out.println("It is a nice day "+x +y);
		
		};
		 MyInteface myInterface2=(x,y)->{
			 System.out.println("Hello "+x+y);
		 };
		
		myInteface.message(name, symbol);
		myInterface2.message(name, symbol);
		
	}

}
