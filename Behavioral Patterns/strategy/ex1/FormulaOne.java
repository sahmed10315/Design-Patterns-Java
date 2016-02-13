package strategy.ex1;

public class FormulaOne extends Vehicle {

	public FormulaOne() {
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
}
