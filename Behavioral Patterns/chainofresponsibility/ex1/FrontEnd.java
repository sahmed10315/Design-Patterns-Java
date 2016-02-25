package chainofresponsibility.ex1;

/* Each chainable object, carries the successor object in the chain as its field */
public class FrontEnd implements HelpInterface {
	final int FRONT_END_HELP = 1;
	HelpInterface successor;

	public FrontEnd(HelpInterface s) {
		successor = s;
	}

	public void getHelp(int helpConstant) {
		if (helpConstant != FRONT_END_HELP) {
			successor.getHelp(helpConstant);
		} else {
			System.out.println("This is the front end. Don't you like it?");
		}
	}
}