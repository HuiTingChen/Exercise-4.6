package AbstractSuperClass;

public class GreenApple extends Apple{
	private boolean makepie;
	
	public GreenApple(String n, int q, double p, boolean pie) { //constructor with argument	
		super(n,q,p); // inherit data from super class with  parameter
		this.makepie = true;
		 
	}
	
	public boolean getpie() {
		return this.makepie;
	}
	
	public String toString() { //overriding method
		return "Is it suitable for making pie? " + this.makepie;
	}
}
