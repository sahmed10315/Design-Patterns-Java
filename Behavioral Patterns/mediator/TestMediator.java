package mediator;

public class TestMediator {
	public static void main(String args[]) {
		Mediator mediator = new Mediator();

		mediator.getWelcome().go();
	}
}