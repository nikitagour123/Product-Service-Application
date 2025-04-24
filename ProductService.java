package productProject;
import java.util.*;
public class ProductService {
	private Map<String, Product> inventory=new HashMap<>();
	
	public void addProduct(String id, Product p) {
		inventory.put(id, p);
	}
	public void removeProduct(String id) {
		if(inventory.containsKey(id)) {
			inventory.remove(id);
			System.out.println("Product is removed!");
		}
		else
			System.out.println("Product is NOT Found in inventory!");
	}
	/*public void countShirt() {
		int count=0;
		Collection<Product> pr=inventory.values();
		for(Product p:pr) {
			if(p instanceof Shirt)
				count++;
		}
	System.out.println("Total Shirt is: "+count);
	}*/
	public void countShirt() {
		System.out.println("Total Shirt in inventory are: "+Shirt.count);
	}
}
