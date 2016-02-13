package pattern.structural.flyweight.ex2;

public class CoffeeShop {
	private final Menu menu = new Menu();

	void takeOrder(String flavourName) {
		CoffeeFlavour flavour = menu.lookup(flavourName);
		System.out.println("Serving flavour: " + flavour);
	}

	String report() {
		return "\ntotal CoffeeFlavour objects made: " + menu.totalCoffeeFlavoursMade();
	}

	public static void main(String[] args) {
		CoffeeShop shop = new CoffeeShop();

		shop.takeOrder("Cappuccino");
		shop.takeOrder("Frappe");
		shop.takeOrder("Espresso");
		shop.takeOrder("Frappe");
		shop.takeOrder("Cappuccino");
		shop.takeOrder("Frappe");
		shop.takeOrder("Espresso");
		shop.takeOrder("Cappuccino");
		shop.takeOrder("Espresso");
		shop.takeOrder("Frappe");
		shop.takeOrder("Cappuccino");
		shop.takeOrder("Espresso");

		System.out.println(shop.report());
	}
}