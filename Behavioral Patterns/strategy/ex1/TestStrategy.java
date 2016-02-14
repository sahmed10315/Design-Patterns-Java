package strategy.ex1;
/**
 * Strategy patterns lets us select algorithms at runtime.
 * Reference : Effective Java, Bloch, Item 21.
 * Reference : Design pattern for dummies.
 */
public class TestStrategy {

	public static void main(String [] args) {
	    Jet jet = new Jet();

	    jet.go();
	    jet.setGoAlgorithm(new GoByDrivingAlgorithm());
	    jet.go();

	    jet.setGoAlgorithm(new GoByFlyingFastAlgorithm());
	    jet.go();

	    jet.setGoAlgorithm(new GoByFlyingAlgorithm());
	    jet.go();
	    
	    StreetRacer streetRacer = new StreetRacer();
	    FormulaOne formulaOne = new FormulaOne();
	    Helicopter helicopter = new Helicopter();
	    
	    streetRacer.go();
	    formulaOne.go();
	    helicopter.go();
	}
}
