package Days100;

import java.util.*;

public class LinearSearchArray {

	public static void main(String[] args) {
		
		int[] r= {3,4,5,6,7};
		int item=6;
		int itemnotFound=0;
		for(int i=0;i<r.length;i++) {
			if(r[i]==item) {
				System.out.println("item is found and "+i+" is index no.");
				itemnotFound=itemnotFound+1;
				
			}
			
		
			}
		if(itemnotFound==0) {
			System.out.println("Item is not found");
			
		}
		}
		
		}
		
	


