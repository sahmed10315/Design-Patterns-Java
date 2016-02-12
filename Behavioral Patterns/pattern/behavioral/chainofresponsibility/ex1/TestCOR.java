package pattern.behavioral.chainofresponsibility.ex1;

public class TestCOR {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		final int FRONT_END_HELP = 1;
		final int INTERMEDIATE_LAYER_HELP = 2;
		final int GENERAL_HELP = 3;

		Application app = new Application();

		IntermediateLayer intermediateLayer = new IntermediateLayer(app);

		FrontEnd frontEnd = new FrontEnd(intermediateLayer);

		frontEnd.getHelp(INTERMEDIATE_LAYER_HELP);
	}
}