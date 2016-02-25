package chainofresponsibility.ex1;

/*
 * Chain of responsibility is about notifying other objects in a chain, where a notification travels down from one object to another, 
 * until it reaches an object capable of processing it.
 * 
 * In JDK they are recognizable by behavioral methods which (indirectly) invokes the same method in another implementation of same abstract/interface type in a queue)
 * Examples: java.util.logging.Logger#log()
 */
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