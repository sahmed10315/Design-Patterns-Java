package chainofresponsibility.ex1;

/* Each chainable object, carries the successor object in the chain as its field */
public class IntermediateLayer implements HelpInterface {
	final int INTERMEDIATE_LAYER_HELP = 2;
	HelpInterface successor; // Next in chain

	public IntermediateLayer(HelpInterface s) {
		successor = s;
	}

	public void getHelp(int helpConstant) {
		if (helpConstant != INTERMEDIATE_LAYER_HELP) {
			successor.getHelp(helpConstant); // Pass to the next object in chain
												// if, its outside of current
												// object scope
		} else {
			System.out.println("This is the intermediate layer. Nice, eh?");
		}
	}
}