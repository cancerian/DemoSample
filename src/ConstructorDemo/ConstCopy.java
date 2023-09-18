package ConstructorDemo;


class Copy{
	int a;String b;
	Copy(){
	a=10;
	b="Sumit";
	System.out.println(a+" "+b);
	}
	Copy(Copy ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
public class ConstCopy {

	public static void main(String[] args) {
		Copy r=new Copy();
		Copy r2=new Copy(r);

	}

}
