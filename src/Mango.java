
public class Mango extends Fruits { 

	protected double price, totalPrice, paid;
	protected int quantity; 
	
	public Mango(String name, double p, int q) { //constructor with argument
		super(name);
		this.quantity = q;
		this.price = p;
		
		if (this.quantity < 20) {
			totalPrice();
			paid = totalPrice();
			System.out.println(name);
		}
		else if (this.quantity > 20 && this.quantity < 80) {
			double pp = 3.99;
			totalPrice(pp);
			paid = totalPrice(pp);
			System.out.println(name);
		}
		else {
			double pp = 1.99;
			int qq = this.quantity;
			totalPrice(pp, qq);
			paid = totalPrice(pp, qq);
			System.out.println(name);
		}
	}
	public double totalPrice() {
		return this.price * this.quantity;
	}
	
	public double totalPrice(double pp) {
		return pp * this.quantity;
	}
	
	
	public double totalPrice(double pp, int qq) {
		return pp * qq;
	}
	
	public String toString() {
		return ("Total Price: RM" + paid);
	}
	
}
