package flyweight;

public class CoffeeShop {
	private final Menu menu = new Menu();

	void takeOrder(String flavourName) {
		CoffeeFlavour flavour = menu.lookup(flavourName);
		System.out.println("Serving flavour: " + flavour);
	}

	String report() {
		return "\ntotal CoffeeFlavour objects made: " + menu.totalCoffeeFlavoursMade();
	}

}