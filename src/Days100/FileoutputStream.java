package Days100;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStream {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos=new FileOutputStream("SSD\\Users\\subrat\\Desktop\\.txt");
		try {
	fos.write(65);
	fos.write(75);
	fos.close();	
			System.out.println("Your program is sucessful");
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
