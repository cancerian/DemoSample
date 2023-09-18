package CollectionStream;

import java.util.*;

public class StreamMapDemo2 {
	public static void main(String[] args) {
		List<String> vehicles=Arrays.asList("bus", "car","bicycle","flight","train");
		
		//wuthout stream()
		
		/*
		 * for(String name:vehicles) { System.out.println(name.length());
		 * 
		 * }
		 */
		
		vehicles.stream().map(v->v.length()).forEach(l->System.out.println(l));
		
		
	}
	
}
