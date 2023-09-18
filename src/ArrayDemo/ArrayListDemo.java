package ArrayDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> d = new ArrayList<Integer>();
		d.add(3);
		d.add(15);
		d.add(-46);
		for(int n = 0;n < d.size();n++) {
		  System.out.print(d.get(n)+" ");
	}

	}
}
