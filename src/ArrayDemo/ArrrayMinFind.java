package ArrayDemo;

public class ArrrayMinFind {
	static  void min(double[] a){
		  double min=a[0];
		 
	       for(int i=1;i<a.length;i++)
	           if(min>=a[i])
	               min=a[i];
	     
	       System.out.println("Min :"+min);
	      
	   }
	 static void max(double[] a) {
		 double max=a[0];
	       for(int i=1;i<a.length;i++)
	           if(max<=a[i])
	        	   max=a[i];
	       System.out.println("Max :"+max);
	 }
	 


	public static void main(String[] args) {
	double[] a= {33,3,4,5,3, 5, 7, 9,6,7,8,9,10,40,68, 1.40,0};
		min(a);
		max(a);

	}

}
