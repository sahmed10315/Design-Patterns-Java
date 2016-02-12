package pattern.structural.decorator.ex2;

public class TestDecorator {
	public static void main(String[] args) {
		Coffee c = new SimpleCoffee();
		System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

		c = new WithMilk(c);
		System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

		c = new WithSprinkles(c);
		System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
		
		Coffee c1 = new WithSprinkles(new WithMilk(new SimpleCoffee())); 
		System.out.println("Cost: " + c1.getCost() + "; Ingredients: " + c1.getIngredients());
	}
}