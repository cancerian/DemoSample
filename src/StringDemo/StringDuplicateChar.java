package StringDemo;

public class StringDuplicateChar {
	public static void main(String[] args) {
		String str=new String ("Testingconfuguration");
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]) 
				{
					System.out.print("duplicate character "+ch[j]);
					count++;
				}
				
			}
			
			
		}
		System.out.println("duplicate count "+count);
	}
	}
	
