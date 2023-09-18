package CollectionArrayList;
import java.util.*;

import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add("A");
		al.add(true);
		
		/*System.out.println(al);
		System.out.println(al.set(1, "manoj"));
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(1, "Welcome");
		System.out.println(al);
		System.out.println(al.contains("manoj"));
		System.out.println(al.isEmpty());
		for(int i=0;i< al.size();i++) {
			System.out.println(al.get(i));
		}*/
		Iterator it=al.iterator();
		while(it.hasNext()) {
			if(it.next().equals("B")) {
				System.out.println("we find the final match");
				break;
			}else {
				System.out.println("sorry Didn't find");
				break;
			}
			
		}
		
	}

}
