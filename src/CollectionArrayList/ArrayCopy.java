package CollectionArrayList;
import java.util.*;
public class ArrayCopy {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add("x");
		ar.add("y");
		ar.add("z");
		ar.add("a");
		ar.add("b");
		ar.add("c");
		
		//ArrayList dup=new ArrayList();
		//dup.addAll(ar);
		//System.out.println(dup);
		//dup.removeAll(ar);
		//System.out.println(dup);
		//System.out.println(ar);
		System.out.println("original"+ar);
		
		Collections.sort(ar);
		System.out.println("accending"+ar);
		Collections.sort(ar,Collections.reverseOrder());
		System.out.println("reverse"+ar);
		
		/*
		 * Collections.sort(ar,Collections.reverseOrder());
		 * System.out.println("Reverse"+ar); Collections.shuffle(ar);
		 * System.out.println("Shuffle"+ar);
		 */
	}

}
