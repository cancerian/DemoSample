package CollectionStream;

//import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
public class FilterDemo1 {

	public static void main(String[] args) {
		/*Listl<Integer> numberlist=new ArrayList();
		
		 * numberlist.add(10); numberlist.add(20); numberlist.add(30);
		 * numberlist.add(40); numberlist.add(50); for(Integer nl: numberlist) {
		 * 
		 * System.out.println("This is number :"+nl); }
		 */
		List<Integer> numberlist=Arrays.asList(10,20,30,40);
		List<Integer> evenNumberList=new ArrayList<Integer>();
		
		// With collector method with lambda expression
		/*
		 * evenNumberList
		 * =numberlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		 * System.out.println(evenNumberList);
		 */	
		
		//with foeEach method with lamda expression 
		//numberlist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		numberlist.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
