package CollectionArrayList;
import java.util.*;
public class ArraysToArraylist {

	public static void main(String[] args) {
		String[] arr= {"Dog","cat","Cow","Duck"};
		
		for(String s:arr) {
			System.out.println( s);
		}
		
		ArrayList arraylist=new ArrayList(Arrays.asList(arr));
		System.out.println(arraylist);
	}

}
