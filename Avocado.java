package AbstractSuperClass;

public class Avocado extends Apple {
	private String type;
	private double fats;
	private boolean heart_healthy;
	
	public Avocado(String n, String t, double p, double f, double q, boolean h){ //constructor with argument	
		super(n,q,p);// inherit data from super class with parameter
		this.type = t;
		this.fats = f;
		this.heart_healthy = h;
		
		//counting fats content in different types of avocado
		if (this.type.equals("Florida")) {
			double ff = 0.153;
			System.out.println("The " + this.type + " avocado's fats amount for " + this.quantity + "g is " + totalFats(ff) + ".");
		}
		else if (this.type.equals("Hass")) {
			double ff = 0.195;
			double times = 1.18;
			System.out.println("The " + this.type + " avocado's fats amount for " + this.quantity + "g is " + totalFats(ff,times) + ".");
		}
		else 
			System.out.println("The " + this.type + " avocado's fats amount for " + this.quantity + "g is " + totalFats() + ".");
		
	}
	
	public String getType() {
		return this.type;
	}
	
	public double getFats() {
		return this.fats;
	}
	
	public boolean getCompare() {
		return this.heart_healthy;
	}
	
	public double totalFats() {
		return this.fats * this.quantity;
	}
	
	public double totalFats(double ff) {
		return this.fats * this.quantity;
	}
	
	public double totalFats(double ff,double times ) {
		return this.fats * this.quantity * times;
	}
	
	public String toString() { //overriding method
		return "Is avocado contain heart healthy fatty acid? " + this.heart_healthy ;
		  	   
	}
}