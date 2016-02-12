package pattern.behavioral.strategy.ex1;

public abstract class Vehicle {

	private GoAlgorithm goAlgorithm;
	
	public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
		this.goAlgorithm = goAlgorithm;
	}
	
	public void go(){
		goAlgorithm.go();
	}
}
