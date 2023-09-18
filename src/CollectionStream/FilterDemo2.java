package CollectionStream;

import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("India","London","Australia","USA");
		List<String> longname=new ArrayList<String>();
		
		longname=names.stream().filter(str->str.length()>4 && str.length()<8).collect(Collectors.toList());
		System.out.println(longname);
	}

}
