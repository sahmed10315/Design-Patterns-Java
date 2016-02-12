package pattern.structural.decorator.ex2;

public abstract class CoffeeDecorator implements Coffee {
	protected final Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee c) {
		this.decoratedCoffee = c;
	}

	public double getCost() { // Implementing methods of the interface
		return decoratedCoffee.getCost();
	}

	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}
}