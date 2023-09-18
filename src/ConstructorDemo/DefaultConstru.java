package ConstructorDemo;


class A{
	int a; String name;
	A(){
		
	}
	void display(){
		System.out.println(a+" "+name);
	}
}
public class DefaultConstru {	
public static void main(String[] args) {
	A ref=new A();
	ref.display();
}
}
