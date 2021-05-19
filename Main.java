package AbstractSuperClass;

public class Main {
	public static void main(String[] args) {
		
		Apple objApple = new Apple("Apple", 105,2);	
		System.out.println();
		
		GreenApple objGApple = new GreenApple("Granny Smith", 8,0.7, true);	
		System.out.println(objGApple.toString()); //calling and print for objGApple
		System.out.println();
		
		RedApple objRApple = new RedApple("Fuji", 80,1.59, true);	
		System.out.println(objRApple.toString()); //calling and print for objRApple
		System.out.println();
		
		Lemon objLemon = new Lemon("Lemon", 0.20, 0.53, 340,"peel", true);
		System.out.println(objLemon);//calling and print for objLemon
		System.out.println();
		
		Avocado objAvocado = new Avocado("Avocado","Hass",0.5, 0.15, 750, true);
		System.out.println(objAvocado);//calling and print for objAvocado
		System.out.println();
	}
}