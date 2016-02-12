package pattern.behavioral.strategy.ex1;

public class StreetRacer extends Vehicle {

	public StreetRacer()
	{
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
}
