package AbstractSuperClass;

class AppleDiscount implements Discount{ //implementing an interface
	public float disRate() { //Method implementation
		return 0.30f; 
	}
}

class RedAppleDiscount implements Discount{ //implementing an interface
	public float disRate() { //Method implementation
		return 0.20f; 
	}
}

class GreenAppleDiscount implements Discount{ //implementing an interface
	public float disRate() { //Method implementation
		return 0.15f; 
	}
}

class LemonDiscount implements Discount{ //implementing an interface
	public float disRate() { //Method implementation
		return 0.05f; 
	}	
}

class AvocadoDiscount implements Discount{ //implementing an interface
	public float disRate() { //Method implementation
		return 0.10f; 
	}
}