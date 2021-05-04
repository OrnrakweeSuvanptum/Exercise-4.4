
public class GreenMango extends Mango {

	private String colour; 
	private String shape;
	
	public GreenMango(String name, double p, int q, String c, String s) {
		super(name, p, q);
		this.colour = c;
		this.shape = s; 
	}
	public String getColour() {
		return this.colour;
	}
	public String getShape() {
		return this.shape;
	}
	
	public String toString() {
		return ("Total Price: RM" + paid + "\n"
				+ "Quantity" + quantity + "\n"
				+ "Colour: " + getColour() + "\n"
				+ "The shape of " + getName() + " is " + getShape());
	}
}
