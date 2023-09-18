package StringDemo;

public class SubString {

	public static void main(String[] args) {
		String sentence="My name is Tony";
		String sentenceaTwo="TonyStark";
		
		String name=sentence.substring(10,sentence.length());
		String name2=sentenceaTwo.substring(4 );
		System.out.println(name);
		System.out.println(name2);

	}

}
