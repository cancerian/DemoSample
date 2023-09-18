package ConstructorDemo;
class A1{
	
	int x,y;
	A1(int a,int b){
		 x=a;  y=b;
	}
	
	void show() {
		System.out.println(x+" "+y);

	}
A1(int a,String b){
		
		System.out.println(a+" "+b);
	}
}
public class ConstructParam {

	public static void main(String[] args) {
		A1 const1=new A1(100,200);
	
		A1 const2=new A1(100,"Mukesh");
		const1.show();

	}

}
