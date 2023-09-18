package CollectionArrayList;
import java.util.*;
public class CopyArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("B");
		al.add("Y");
		al.add("C");
		al.add("A");
		
		//System.out.println(al);
		
	/*	Iterator e= al.iterator();
		while(e.hasNext()) {
			
			System.out.println(e.next());
		}
		
		ArrayList duplicateAl=new ArrayList();
		duplicateAl.addAll(al);
		System.out.println("before "+duplicateAl);
		duplicateAl.removeAll(al);
		System.out.println("after remove"+duplicateAl);*/
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("reverse  Order"+al);
		Collections.shuffle(al);
		System.out.println(al);
	}

}
