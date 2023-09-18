package JavaPracProb;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
	
	 // Make a collection
    List<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    
    System.out.println(cars.size());
    System.out.println(cars.get(3));
    cars.remove(3);
    System.out.println(cars.size());
    // Get the iterator
    Iterator<String> it = cars.iterator();

    while (it.hasNext()) {
   //  Print the first item
    System.out.print(it.next()+", ");
    
	/*
	 * for(String n: cars) { System.out.print(n+", "); 
	 * }
	 */
    }}
	}
	


