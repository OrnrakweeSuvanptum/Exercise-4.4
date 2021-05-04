
public class Guava extends Fruits {

	private String benefits;
	private double weight;
	private double price;

	
	public Guava(String name, String b, double w, double p) {
		super(name);
		this.benefits = b;
		this.weight = w; 
		this.price = p;
		
		System.out.println("Guava constructor is invoke");
	}
	
	public String getBenefits() {
		return this.benefits;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double calPrice() {
		return this.price * this.weight;
	}
	
	public String toString() {
		return ("The benefits " + getName() + " is " + getBenefits() + "\n" 
		        + "Weight: " + getWeight() + "kg" + "\n"
				+ "Total Price: RM" + calPrice());
		
	}
}
