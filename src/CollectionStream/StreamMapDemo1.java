package CollectionStream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMapDemo1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		List<String> vehicle= Arrays.asList("bus","car","bicycle","flight","train");
		List<String> vehicleUpper=new  ArrayList<String>();
		
		vehicleUpper=vehicle.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehicleUpper);
	}

}
