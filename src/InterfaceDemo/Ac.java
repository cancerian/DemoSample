package InterfaceDemo;

public interface Ac {
void c1();
void c2();
public default void c3() {
	System.out.println("this is c3 default method of interface AC");
}
}
