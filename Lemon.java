package AbstractSuperClass;

public class Lemon extends Apple {
	private double vitaminC;
	private String form;
	private boolean compare;
	
	public Lemon(String n, double p, double vitC, double q, String f, boolean c) { //constructor with  argument	
		super(n,q,p);// inherit data from super class with parameter
		this.vitaminC = vitC;
		this.form = f;
		this.compare = c;
		
		//counting vitamin C content in lemon juice or lemon peel
		if (form.equals("juice")) {
			double vC = 0.053;
			System.out.println("The vitamin c content in " + this.quantity + "g lemon " + this.form + " is " + totalvitC(vC));
		}
		else if (form.equals("peel")) {
			double vC = 0.043;
			double times = 3;
			System.out.println("The vitamin c content in " + this.quantity + "g lemon " + this.form + " is " + totalvitC(vC,times));
		}
		else 
			System.out.println("The vitamin c content in " + this.quantity + "g lemon " + this.form + " is " + totalvitC());
		
	}
	
	public double getvitaminC() {
		return this.vitaminC;
    }
  
    public double totalvitC() {
	    return this.vitaminC * this.quantity;
    }
    
    public double totalvitC(double vC) {
  	    return vC * this.quantity;
    }
    
    public double totalvitC(double vC,double times) {
  	    return vC * this.quantity * times;
    }
    
    public String getForm() {
		return this.form;
    }
  
    public boolean getCompare() {
		return this.compare;
    }
    
    public String toString() { //overriding method
		return  "Is lemon peel has higher vitamin C? " + this.compare;
	}
}

