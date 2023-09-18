package ArrayDemo;

public class ArrayDemo {
public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
	String[] car= new String[4];
	car[0]="Honda";
	car[1]="Audi";
	car[2]="Maruti";
	car[3]="Tata";
	
	for(int i=0;i<=car.length;i++) {
		System.out.println(car[i]);
	}
	
}
}
