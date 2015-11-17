package entities;

public class Product {

	private String id;
	private String name;
	private double price;
	
	public Product() {
		super();
	}
	
	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	
}
