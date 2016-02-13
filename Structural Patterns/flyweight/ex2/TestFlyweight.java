package flyweight.ex2;

public class TestFlyweight {
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
