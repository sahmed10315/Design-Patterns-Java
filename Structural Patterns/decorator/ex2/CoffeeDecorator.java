package decorator.ex2;

/* Subclass the original "Component" into a "Decorator" class
*  In the Decorator class, add a Component pointer as a field;
*/
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