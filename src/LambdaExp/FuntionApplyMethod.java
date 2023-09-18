package LambdaExp;


import java.util.function.Function;
public class FuntionApplyMethod {

	public static void main(String[] args) {
		//Ex1
		Function<Integer,Integer> f= n->n*n;
		System.out.println(f.apply(5)); //25
		System.out.println(f.apply(10));	//100
		System.out.println(f.apply(2));		//4
		
		//Ex2
		Function<String,Integer> fn= s->s.length();
		System.out.println("Length of the word :"+fn.apply("Friends"));
		System.out.println(fn.apply("Wel"));
	}

}
