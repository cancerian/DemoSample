package JavaConstructor;
class A
{
	int a;
	String b;
	A(){
		a=10;
		b="Mumbai";
		
		
	}
	A(A ref){
		a=ref.a;
		b=ref.b;
		System.out.println("This is reference"+a+" "+b);
	}
}
public class CopyConstructor {
	
public static void main(String[] args) {
	A f=new A();
	A f1=new A(f);
}
}
