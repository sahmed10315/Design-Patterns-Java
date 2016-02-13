package pattern.structural.flyweight.ex2;

//Instances of CoffeeFlavour will be the Flyweights
public class CoffeeFlavour {
	private final String name;

	CoffeeFlavour(String newFlavor) {
		this.name = newFlavor;
	}

	@Override
	public String toString() {
		return name;
	}
}