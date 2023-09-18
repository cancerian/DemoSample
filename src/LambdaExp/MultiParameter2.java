package LambdaExp;

import java.util.function.Predicate;

public class MultiParameter2 {

	public static void main(String[] args) {
		int[] a= {5,10,15,20,25,30,35,40,45,50,55,60,65};
		
		Predicate<Integer> p1=i->(i%2==0);
		Predicate<Integer> p2=i->i>30;
		
		for(int n:a) {
			//AND operator
			if(p1.and(p2).test(n))//if(p1.test(n) && p2.test(n)) this format can be written also below pattern
{
				System.out.println("this is AND Operator"+n);
			}
			
			//OR operator
			if(p1.or(p2).test(n))
			{
							System.out.println("this is OR Operator"+n);
						}
			//neagte
			if(p1.negate().test(n))
			{
							System.out.println("this is negate Operator"+n);
						}
			
		}

	}

}
