package JavaPracProb;

public class MethodName {
	
	public String myname(String name) {
		System.out.println("Name :"+name);
		return name;
	}

	public static void main(String[] args) {
		MethodName mn=new MethodName();
		String a=mn.myname("amar");
		String b=mn.myname("akbar");
		String c=mn.myname("anthony");
		
	}

}
