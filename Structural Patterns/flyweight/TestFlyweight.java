package flyweight;

/* A Flyweight pattern uses sharing to support large numbers of fine-grained objects efficiently which 
 * represent same value.
 * FLyweight objects must be immutable and value objects, and two instances of flyweight of same value are considered equal.
 * 
 * In JDK they are recognizable by creational methods returning a cached instance
 * Reference: Effective Java, Item 1 
 * JDK Examples:  java.lang.Integer#valueOf(int) (also on Boolean, Byte, Character, Short, Long and BigDecimal)
 * */
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
