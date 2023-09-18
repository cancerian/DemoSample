package ArrayDemo;

public class ArrayMD {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		String[][] string= {{"ram","shayam","john"},{"amar","akbar","anthony"}};
		for(int i=0;i<string.length;i++) {
			for(int j=0;j<string[i].length;j++) {
				System.out.print(string[i][j]+" ");
			}
			System.out.println();
		}

	}

}
