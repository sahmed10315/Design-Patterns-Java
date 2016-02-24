package decorator.ex2;

/*The second concrete decorator which adds sprinkles to the core component SimpleCoffee */
public class WithSprinkles extends CoffeeDecorator {
	public WithSprinkles(Coffee c) {
		super(c);
	}

	public double getCost() {
		return super.getCost() + 0.2;
	}

	public String getIngredients() {
		return super.getIngredients() + ", Sprinkles";
	}
}