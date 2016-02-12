package pattern.behavioral.chainofresponsibility.ex1;

public class Application implements HelpInterface {

	public Application() {
	}

	public void getHelp(int helpConstant) {
		System.out.println("This is the MegaGigaCo application.");
	}
}
