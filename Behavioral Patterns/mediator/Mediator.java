package mediator;

/* This class encapsulates how a set of objects interact. It is aware of all the Colleagues and their purpose with regards to inter communication*/
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

	// Objects no longer communicate directly with each other, but instead
	// communicate through this mediator method
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