package Days100;

import java.io.*;

public class ReaderFileProgram {

	public static void main(String[] args)   {
	
	try {
		
		FileReader fr= new FileReader("\\Users\\subrat\\Desktop\\dilll.txt");
		BufferedReader read=new BufferedReader(fr);
		String input=read.readLine();
		read.close();
		System.out.println(input);
	}catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	

	}

}
