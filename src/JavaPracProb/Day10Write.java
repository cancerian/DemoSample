package JavaPracProb;

import java.io.*;

public class Day10Write {

	public static void main(String[] args) throws IOException {
		
		try {
			String data="this line we want to write in the file";
			String name="my name is subrat";
			OutputStream output=new FileOutputStream("Users\\subrat\\eclipse-workspace\\java\\file.txt");
			byte[] array= data.getBytes();
			byte[] array1=name.getBytes();
			
			output.write(array);
			output.write(array1);
			System.out.println("CONTENT IS WRITTEN IN FILE");
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception "+ e);
		}
		

	}

}
