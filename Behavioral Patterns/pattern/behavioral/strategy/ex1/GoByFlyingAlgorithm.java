package pattern.behavioral.strategy.ex1;

public class GoByFlyingAlgorithm implements GoAlgorithm {

	@Override
	public void go() {
		System.out.println("Now I'm flying.");
	}

}
