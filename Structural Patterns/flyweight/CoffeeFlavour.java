package flyweight;

/* Instances of CoffeeFlavour will be the Flyweights.
 * These classes are immutable as name is final.
 */
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