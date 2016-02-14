package strategy.ex1;

/**
 * The subclasses of Vehicle define there desired algorithm at runtime.
 */
public class FormulaOne extends Vehicle {

	public FormulaOne() {
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
}
