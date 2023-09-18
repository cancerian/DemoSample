package CollectionStream;
import java.util.*;
import java.util.stream.Collectors;
public class Product {

	int id;
	String name; 
	int price;
	public Product(int id, String name, int price) {
	
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		
		List<Product> productlist=new ArrayList<Product>();
		productlist.add(new Product(1,"HP laptop", 38000));
		productlist.add(new Product(2,"Dell laptop", 48000));
		productlist.add(new Product(3,"Lenovo laptop", 28000));
		productlist.add(new Product(4,"Sony laptop", 28000));
		productlist.add(new Product(5,"Apple laptop", 80000));
		
		productlist.stream().filter(p->p.price>32000).forEach(pr->System.out.println("Name :"+pr.name+"Price:"+pr.price));
		
	}

}
