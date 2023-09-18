package MapDemo;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap map=new HashMap();
		   HashMap<Integer, String> map=new HashMap<Integer, String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		 //  System.out.println("Iterating Hashmap..."+map);  
			/*
			 * for(Map.Entry m : map.entrySet()){
			 * System.out.println(m.getKey()+" "+m.getValue()); }
			 */
			/*
			 * System.out.println(map.get(2)); System.out.println(map.containsKey(4));
			 * System.out.println(map.containsValue("Banana")); System.out.println(
			 * map.put(5, null)); System.out.println( map.put(6, "Happy"));
			 * System.out.println(map); System.out.println(map.putIfAbsent(5, "max"));
			 * System.out.println(map);
			 */
		   //Hashmap method
			/*
			 * for(Object i:map.keySet()) { System.out.println(i+" "+map.get(i)); }
			 */
		   //entry or entry Interface method
		   for(Map.Entry  entry: map.entrySet()) {
			   
			   System.out.println(entry.getKey()+" "+entry.getValue());
		   }
	}

}
