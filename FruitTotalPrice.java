package AbstractSuperClass;

class ApplePrice implements TotalPrice{ //implementing an interface
	
	public double totalPrice(double p, double q) { //Method implementation
		double pp = p-0.05;// purchase more than 10 but less than 100, price will deduct 0.05
		double totalP = pp*q;//price multiply quantity
		return totalP; 
	}
	
	public double totalPrice(double p, double q, double d) { //Method implementation
		double pp = (p-0.10);//purchase more than 100 , price will deduct 0.10
		double totalP = pp*q*(1-d);//price multiply quantity multiply discount
		return totalP; 
	}
}

class LemonPrice implements TotalPrice{ //implementing an interface
	
	public double totalPrice(double p, double q) { //Method implementation
		double pp = p-0.05;// purchase more than 10 but less than 100, price will deduct 0.05
		double totalP = pp*q;//price multiply quantity
		return totalP; 
	}
	
	public double totalPrice(double p, double q, double d) { //Method implementation
		double pp = p-0.10;//purchase more than 100 , price will deduct 0.10
		double totalP = pp*q*(1-d);//price multiply quantity multiply discount
		return totalP; 
	}	
}

class AvocadoPrice implements TotalPrice{ //implementing an interface
	
	public double totalPrice(double p, double q) { //Method implementation
		double pp = p-0.10;// purchase more than 10 but less than 100, price will deduct 0.10
		double totalP = pp*q;//price multiply quantity
		return totalP; 
	}
	
	public double totalPrice(double p, double q, double d) { //Method implementation
		double pp = p-0.20;//purchase more than 100 , price will deduct 0.20
		double totalP = pp*q*(1-d);//price multiply quantity multiply discount
		return totalP;  
	}
}