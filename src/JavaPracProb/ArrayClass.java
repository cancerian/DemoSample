package JavaPracProb;

public class ArrayClass {

	public static void main(String[] args) {
		String[] groceries= {"apple","banana", "carrot","Olive oil","avacados"};
		System.out.println("Number of groceries list "+groceries.length);
		for(String items:groceries) {
			System.out.print(items+", ");
		}
		System.out.println();
		
		groceries[3]=null;
		
		System.out.println(groceries.length);
		for(String item:groceries) {
			System.out.println("item are after remove 3rd array "+item);
		}
		

	}

}
