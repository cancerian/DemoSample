package JavaConstructor;
class AB{
	int a;
	double b;
	String c;
	AB(){
		a=100;
		b=10.25;
		c="subrat";
	}
	AB(int x){
		
		a=x;
	}
	AB(double y, String z){
		b=y;c=z;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		AB ab=new AB();
		AB ab1=new AB(10);
		AB ab3=new AB(23.89,"sneha");
		System.out.println(ab.a+" "+ab.b+" "+ab.c);
		System.out.println(ab1.a);
		System.out.println(ab3.b+" "+ab3.c);
		

	}

}
