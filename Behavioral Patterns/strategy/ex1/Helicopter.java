package strategy.ex1;

/**
 * The subclasses of Vehicle define there desired algorithm at runtime.
 */
public class Helicopter extends Vehicle {

	public Helicopter() {
		setGoAlgorithm(new GoByFlyingAlgorithm());
	}
}
