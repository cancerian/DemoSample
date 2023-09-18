package ArrayDemo;

public class GenericArray {

	public static void main(String[] args) {
		Integer[] intarray= {1,2,3,4,5};
		Double[] doubleArray= {2.3,12.45,98.33,44.34};
		Character[] charArray= {'H','E','L','L','O'};
		String[] stringArray= {"B","Y","E"};
		
		
		displayArray(intarray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		

	}
	public static void displayArray(Integer[] array) {
		
		for(Integer x:array) {
			System.out.println(x+", ");
		}
	}
public static void displayArray(Double[] array) {
		
		for(Double x:array) {
			System.out.println(x+", ");
		}
	}
public static void displayArray(Character[] array) {
	
	for(Character x:array) {
		System.out.println(x+", ");
	}
}
public static void displayArray(String[] array) {
	
	for(String x:array) {
		System.out.println(x+", ");
	}
}

}
