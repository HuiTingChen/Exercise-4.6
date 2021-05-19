package AbstractSuperClass;

public class RedApple extends Apple  { 
	private boolean sugar;
	
	public RedApple(String n, int q, double p, boolean s) { //constructor with argument	
		super(n,q,p); // inherit data from super class with  parameter
		this.sugar = true;
		
	}
	
	public boolean getsugar() {
		return this.sugar;
    }
	
	public String toString() { //overriding method
		return "Is red apple has higher sugar level compare to green apple? " + this.sugar;
	}
}