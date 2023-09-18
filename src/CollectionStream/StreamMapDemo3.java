package CollectionStream;

import java.util.*;
import java.util.stream.*;

public class StreamMapDemo3 {
	public static void main(String[] args) {
		/*
		 * List<Integer> numberList=Arrays.asList(2,3,4,5); List<Integer>
		 * multipliedList=new ArrayList<Integer>();
		 * 
		 * 
		 * for(int num :numberList) { System.out.print(num*3 +" "); }
		 * 
		 * 
		 * multipliedList=numberList.stream().map(n->n*3).collect(Collectors.toList());
		 * System.out.println(multipliedList);
		 */
		/*
		 * List<String> names = Arrays.asList("Reflection","Collection","Stream");
		 * List<String> result = names.stream().sorted().collect(Collectors.toList());
		 * System.out.println(result);
		 * 
		 */
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> multiplyNumber=number.stream().map(num->num*3).collect(Collectors.toList());
		System.out.println(multiplyNumber);
		
		List<String> name=Arrays.asList("refelection","collection","stream");
		List<String> result=name.stream().filter(n->n.startsWith("s")).collect(Collectors.toList());
		System.out.println(result);

	}

}
