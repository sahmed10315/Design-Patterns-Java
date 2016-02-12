package pattern.behavioral.strategy.ex1;

public class Jet extends Vehicle {

	public Jet(){
		setGoAlgorithm(new GoByFlyingFastAlgorithm());
	}
}
