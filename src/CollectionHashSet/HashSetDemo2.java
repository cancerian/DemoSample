package CollectionHashSet;
import java.util.*;
public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet set1=new HashSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		HashSet set2=new HashSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		//Union
		/* set1.addAll(set2);
		 System.out.println("Union"+set1);
		 
		 //intersection
		 set1.retainAll(set2);
		 System.out.println("intersection"+set1);
		 */
		 //difference
		 set1.removeAll(set2);
		 System.out.println(set1);
		

	}

}
