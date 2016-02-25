package chainofresponsibility.ex1;

/* Each chainable object, carries the successor object in the chain as its field */
public class Application implements HelpInterface {

	public void getHelp(int helpConstant) {
		System.out.println("This is the MegaGigaCo application.");
	}
}