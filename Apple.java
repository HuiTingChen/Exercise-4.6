package AbstractSuperClass;

import java.text.DecimalFormat;

public class Apple extends Fruit{
	private static DecimalFormat df2 = new DecimalFormat("#,###,###,###.##"); //for setting 2 decimal places
	protected double quantity;
	protected double price;
	
	public Apple(String n, double q, double p) { //constructor with argument	
		super(n);// inherit data from super class with 1 parameter
		this.quantity = q;
		this.price = p;
		
		//object for total price of each fruit
		TotalPrice a = new ApplePrice(); // create a new object 
		TotalPrice av = new AvocadoPrice(); // create a new object 
		TotalPrice l = new LemonPrice(); // create a new object 
		
		System.out.println("Fruit Name: " + name);
		
		if (this.quantity < 10) {
			double totalPrice = p*q;
			System.out.println("If purchased quantity LESS than 10, Total price: RM" + df2.format(totalPrice));
		
		}
		else if (this.quantity > 10 && this.quantity < 100) {
			if (name =="Apple" || name == "Granny Smith" || name == "Fuji") {	
				System.out.println("If purchased quantity MORE than 10, Total price: RM" + df2.format(a.totalPrice(p,q)));
			}
			else if (name == "Avocado"){
				System.out.println("If purchased quantity MORE than 10, Total price: RM" + df2.format(av.totalPrice(p,q)));
			}
			else{
				System.out.println("If purchased quantity MORE than 10, Total price: RM" + df2.format(l.totalPrice(p,q)));
			}
		}	
	
		else {	
			
			if (name =="Apple") {
				Discount d = new AppleDiscount(); //create new object	
				double dis = d.disRate(); //daily discount rate
				System.out.println("Daily rate of discount: " + d.disRate() + "%"); //calling for discount rate 				
				System.out.println("If purchased quantity MORE than 100, Total price: RM" + df2.format(a.totalPrice(p,q,dis)));
			}
			
			else if (name == "Granny Smith") {
				Discount d2 = new RedAppleDiscount(); //create new object	
				double dis = d2.disRate(); //daily discount rate
				System.out.println("Daily rate of discount: " + d2.disRate() + "%"); //calling for discount rate 				
				System.out.println("If purchased quantity MORE than 100, Total price: RM" + df2.format(a.totalPrice(p,q,dis)));
			}
			
			else if (name == "Fuji") {
				Discount d3 = new GreenAppleDiscount(); //create new object	
				double dis = d3.disRate(); //daily discount rate
				System.out.println("Daily rate of discount: " + d3.disRate() + "%"); //calling for discount rate 				
				System.out.println("If purchased quantity MORE than 100, Total price: RM" + df2.format(a.totalPrice(p,q,dis)));
			}
			
			else if (name == "Avocado"){
				Discount d4 = new AvocadoDiscount(); //create new object	
				double dis = d4.disRate(); //daily discount rate
				System.out.println("Daily rate of discount: " + d4.disRate() + "%"); //calling for discount rate 
				System.out.println("If purchased quantity MORE than 100, Total price: RM" + df2.format(av.totalPrice(p,q,dis)));
			}
			
			else {
				Discount d5 = new LemonDiscount(); //create new object	
				double dis = d5.disRate(); //daily discount rate
				System.out.println("Daily rate of discount: " + d5.disRate() + "%"); //calling for discount rate 
				System.out.println("If purchased quantity MORE than 100, Total price: RM" + df2.format(l.totalPrice(p,q,dis)));
			}
		}
		
	}
	
	public double getQuantity() {
		return this.quantity;
    }
	
	public double getPrice() {
		return this.price;
    }
	
}