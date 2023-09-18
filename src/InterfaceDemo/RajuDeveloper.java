package InterfaceDemo;

import java.util.*;
interface Client{
	void input();
	void output();
} 
public class RajuDeveloper implements Client{
	
	String name;
	double sal;

	Scanner sc=new Scanner(System.in);
	@Override
	public void input() {
		
		System.out.println("enter the name ");
		name=sc.nextLine();
		System.out.println("enter the Salary ");
		sal=sc.nextDouble();
	}
	@Override
	public void output() {
		System.out.println("Name :"+name +"\nsalary :"+sal);
	}
	public static void main(String[] args) {
		
		Client c= new  RajuDeveloper();
		c.input();
		c.output();
	}

}
