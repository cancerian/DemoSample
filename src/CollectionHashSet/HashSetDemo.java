package CollectionHashSet;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//HashSet hs=new HashSet(100,(float)0.95);
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("Welcome");
		hs.add(16.4);
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		hs.remove(16.4);
		System.out.println(hs);
		System.out.println(hs.contains("Welcome"));
		
		System.out.println(hs.isEmpty());
		for(Object e: hs) {
			System.out.println("for loop :"+e);
		}
		Iterator it= hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
