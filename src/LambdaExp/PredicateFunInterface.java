package LambdaExp;

import java.util.function.Predicate;

public class PredicateFunInterface {

	public static void main(String[] args) {
		
		//Ex1
		// Predicate<Integer> p=i->(i>10);
	//	System.out.println( p.test(5));//false
	//	System.out.println( p.test(40));//true
		//Ex2
		Predicate<String> str=s->(s.length()>4);
	
		
		//System.out.println("the name length is more then 4 "+str.test("Subrat"));//true
		//System.out.println("the name length is more then 4 "+str.test("xyx"));//false
		
		//Ex3
		String[] names= {"David","Scott","Smith","John","Mary"};
		for(String name:names) {
			if(str.test(name)){
				System.out.println(name);
			}

		}
	}

}
