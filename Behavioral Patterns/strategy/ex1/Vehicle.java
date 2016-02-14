package strategy.ex1;

/**
 * The Vehicle class encapsulates the strategy object, by encapsulating the
 * strategy interface the algorithm become interchangable within the family.
 */
public abstract class Vehicle {

	private GoAlgorithm goAlgorithm;

	public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
		this.goAlgorithm = goAlgorithm;
	}

	public void go() {
		goAlgorithm.go();
	}
}
