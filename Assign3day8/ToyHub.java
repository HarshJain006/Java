package Assign3day8;

public class ToyHub {
	private int prodid;
	private String name;
	private double price;
	private int age;
	private int purchaseyear;
	public int getProdid() {
		return prodid;
	}
	
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCategory() {
		return category;
	}
	
	public int getPurchasemonth() {
		return purchasemonth;
	}
	
	public int getPurchaseYear() {
		return purchaseyear;
	}
	
	public ToyHub(int prodid, String name, double price, int age, String category, int purchasemonth, int purchaseyear) {
		super();
		this.prodid = prodid;
		this.name = name;
		this.price = price;
		this.age = age;
		this.category = category;
		this.purchasemonth = purchasemonth;
		this.purchaseyear = purchaseyear;
	}
	private String category;
	private int purchasemonth;
	@Override
	public String toString() {
		return "ToyHub [name=" + name + ", price=" + price + ", category=" + category + ", purchasemonth="
				+ purchasemonth + "]";
	}
	
	

}
