package decorator.ex2;

/* Core component, which should always be present */
public class SimpleCoffee implements Coffee {
	@Override
	public double getCost() {
		return 1;
	}

	@Override
	public String getIngredients() {
		return "Coffee";
	}
}