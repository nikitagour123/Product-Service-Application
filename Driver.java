package productProject;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductService service=new ProductService();
		service.addProduct("sh121", new Shirt("cloth","levis", 1800, "men's Shirt", 40,"white" ,"half"));
		
		System.out.println("Press 1 for Admin Access and 2 for User Access!");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Admin Access");
			System.out.println("Press 1 to add product");
			
			
		}
		else if(choice==2) {
			
		}
		else {
			System.out.println("Invalid choice enterd!!");
		}
		
		
		
	}

}
