package StringDemo;
import java.util.*;
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		//StringBuilder sb=new StringBuilder("Tony");
		StringBuilder sb=new StringBuilder("H");
		//System.out.println(sb);
		
		//System.out.println(sb.charAt(2));
		//sb.setCharAt(0, 'P');
		//System.out.println(sb);
		//sb.insert(2, 'n');
		//System.out.println(sb);
		//sb.delete(2, 3);
		//System.out.println(sb );
		sb.append('e');
		sb.append('l');
		sb.append('l');
		sb.append('o');
		System.out.println(sb);
		System.out.println(sb.length());
	}

}
