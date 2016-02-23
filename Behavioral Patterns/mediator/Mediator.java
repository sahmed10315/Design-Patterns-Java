package mediator;

public class Mediator {
	Welcome welcome;
	Shop shop;
	Purchase purchase;
	Exit exit;

	public Mediator() {
		welcome = new Welcome(this);
		shop = new Shop(this);
		purchase = new Purchase(this);
		exit = new Exit(this);
	}

	public void handle(String state) {
		if (state.equals("welcome.shop")) {
			shop.go();
		} else if (state.equals("shop.purchase")) {
			purchase.go();
		} else if (state.equals("welcome.exit")) {
			exit.go();
		} else if (state.equals("shop.exit")) {
			exit.go();
		} else if (state.equals("purchase.exit")) {
			exit.go();
		}
	}

	public Welcome getWelcome() {
		return welcome;
	}
}