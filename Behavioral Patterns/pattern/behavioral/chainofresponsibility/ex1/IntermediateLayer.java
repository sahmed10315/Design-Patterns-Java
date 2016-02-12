package pattern.behavioral.chainofresponsibility.ex1;

public class IntermediateLayer implements HelpInterface {
	final int INTERMEDIATE_LAYER_HELP = 2;
	HelpInterface successor;

	public IntermediateLayer(HelpInterface s) {
		successor = s;
	}

	public void getHelp(int helpConstant) {
		if (helpConstant != INTERMEDIATE_LAYER_HELP) {
			successor.getHelp(helpConstant);
		} else {
			System.out.println("This is the intermediate layer. Nice, eh?");
		}
	}
}