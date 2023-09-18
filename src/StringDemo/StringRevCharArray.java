package StringDemo;

public class StringRevCharArray {
public static String RevCharArray(String name) {
	char[] ch=name.toCharArray();
	String rev="";
	for(int i=ch.length-1;i>=0;i--) {
		rev+=ch[i];
	}
	return rev;
}
}
