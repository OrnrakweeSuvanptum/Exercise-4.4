
public class YellowMango extends Mango {

	private String taste;
	private String types;
	private double discount;
	
	public YellowMango(String name, double p, int q, String t, String types, double d) {
		super(name, p, q);
		this.taste = t; 
		this.types = types; 
		this.discount = d;
	}
	public String getTaste() {
		return this.taste;
	}
	
	public String getTypes() {
		return this.types;
	}
	
	public double calDiscount() {
		return (super.totalPrice()*this.discount);
	}

	public double calPrice() {
		return (super.totalPrice()-calDiscount());
		
	}
	
	public String toString() {
		return ("Total Price: RM" + paid + "\n"
				+ "Taste of " + getName() + " is " + getTaste() + "\n"
				+ "Types of " + getName() + " is " + getTypes() + "\n"
				+ "Discount Price: RM" + calDiscount() + "\n"
				+ "Price after discount: " + calPrice());
	}
}
