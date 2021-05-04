
public class Main {

	public static void main(String[] args) {
		
		Mango m = new Mango("Mango",4.99, 150); //new object for super class
		System.out.println(m);
		System.out.println(); 
		
		YellowMango ym = new YellowMango("Honey Mango", 1.99, 200, "Sweet", "Golden", 0.05); //new object for sub class
		System.out.println(ym);
		System.out.println();
		
		GreenMango gm = new GreenMango("Sour Mango", 2.99, 60, "Green", "Roughly oval"); //new object for sub class
		System.out.println(gm);
		System.out.println();
		
		Guava g = new Guava("Guava", "Boost Heart Health", 0.5, 13.5);
		System.out.println(g);
		
		
	}

}
