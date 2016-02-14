package strategy.ex1;

/**
 * Concrete strategy class representing a particular algorithm.
 */
public class GoByFlyingFastAlgorithm implements GoAlgorithm {

	@Override
	public void go() {
		System.out.println("Now I'm flying fast.");
	}

}
