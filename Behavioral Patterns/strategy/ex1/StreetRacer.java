package strategy.ex1;

/**
 * The subclasses of Vehicle define there desired algorithm at runtime.
 */
public class StreetRacer extends Vehicle {

	public StreetRacer() {
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
}
