package pattern.behavioral.strategy.ex1;

public class Helicopter extends Vehicle {

	public Helicopter() {
		setGoAlgorithm(new GoByFlyingAlgorithm());
	}
}
