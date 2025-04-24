package productProject;

public class Shirt extends Product{
	static int count=0;
	String subCategory;
	int size;
	String color;
	String type;//half or full
	
	{
		count++;
	}
	Shirt(){
		
	}
	Shirt(String category, String brand, double price,String subCategory,int size,String color,String type)
	{
		super(category, brand, price);
		this.subCategory=subCategory;
		this.size=size;
		this.color=color;
		this.type=type;
	}
	public String toString() {
	return category+"\t"+brand+"\t"+price+"\t"+subCategory+"\t"+size+"\t"+color+"\t"+type;
	}
}
