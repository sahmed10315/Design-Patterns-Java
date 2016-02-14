package strategy.ex1;

/**
 * The subclasses of Vehicle define there desired algorithm at runtime.
 */
public class Jet extends Vehicle {

	public Jet() {
		setGoAlgorithm(new GoByFlyingFastAlgorithm());
	}
}
