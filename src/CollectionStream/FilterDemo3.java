package CollectionStream;

import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("cup",null,"forest","sky","book",null,"theatre");
		List<String> result=new ArrayList<String>();
		
		//result=words.stream().filter(w->w!=null).collect(Collectors.toList());
		//System.out.println(result);
		words.stream().filter(wl->wl!=null).forEach(System.out::println);
	}

}
